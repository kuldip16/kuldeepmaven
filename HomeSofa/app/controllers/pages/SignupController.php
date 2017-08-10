<?php
/**
 * Copyright (c) 2016 Kabs Polsterwelt Online GmbH <sebastian.bonath@kabs.de>
 * All rights reserved.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT  * NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER ORCONTRIBUTORS
 * BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY,
 * OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * @author     Sebastian Bonath <sebastian.bonath@kabs.de>
 * @copyright  Kabs Polsterwelt Online GmbH <sebastian.bonath@kabs.de>, All rights reserved.
 *
 */

namespace RTB\Core\ShopFrontOffice\Controllers\Pages;

use RTB\Core\ShopFrontOffice\{
    Controllers\Base\Controller,
    Models\AclRoles
};
use RTB\Core\ShopFrontOffice\Services\UserServices;

/**
 * ...
 *
 * @package RTB\Core\ShopFrontOffice
 * @author Sebastian Bonath <sebastian.bonath@kabs.de>
 * @link https://www.kabs.de
 * @version 1.0.0
 * @since 1.0.0
 */
class SignupController extends Controller
{
    protected $isRestricted = true;
    protected $deniedRoles  = [
        AclRoles::CONTACTROLE,
        AclRoles::CUSTOMERROLE
    ];

    protected $resourceName = 'Signup';
    protected $resourceDescription = 'Signup Resource';
    protected $contactEntity;
    protected $postData;
    protected $userService;
    public $error = null;
    
    
    public function initialize() {
        parent::initialize();
        $this->userService = new UserServices();
    }
       
    public function indexAction()
    {
        $contact = $this->session->get('auth');
        if(!empty($contact)){
            return $this->response->redirect('mein-konto');
        }
    }
    /*
     * Authenticate Users while login
     */
    public function authenticateAction()
    {
        if ($this->request->isPost()) {
            $email = $this->request->getPost('email', 'email');
            $password = $this->request->getPost('password', 'string');
            if($this->userService->authenticateContact($email, $password)){
                if ($this->request->isAjax()) {
                    return UserServices::SUCCESS;
                }
                return $this->response->redirect('mein-konto');
            }else{
                if ($this->request->isAjax()) {
                    return UserServices::WRONGEMAILPASS;
                }
                $this->error = UserServices::WRONGEMAILPASS;
            }
        }
        if(!is_null($this->error)){
            $this->flash->error($this->error);
        }
        return $this->dispatcher->forward(
            [
                "controller" => "signup",
                "action"     => "index",
            ]
        );
    }
    /*
     * Register new User
     */
    public function signupAction()
    {
       $form = new \RTB\Core\ShopFrontOffice\Forms\RegisterForm;
       if ($this->request->isPost()) {
            $email = $this->request->getPost('email', 'email');
            $password = $this->request->getPost('password', 'string');
            $repeatPassword = $this->request->getPost('repeatPassword', 'string');
            $response = $this->userService->createContact($email, $password, $repeatPassword);
            if($response == UserServices::SIGNUPSUCCESS){
                if ($this->request->isAjax()) {
                    return $response;
                }
                $this->flash->success((string) $response);
                return $this->response->redirect('login');
            }else{
                if ($this->request->isAjax()) {
                    return $response;
                }
                $this->flash->error($response);
            }
       }
       $this->view->form = $form;
    }
}