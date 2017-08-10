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

use RTB\Core\ShopFrontOffice\Controllers\Base\Controller;
use RTB\Core\ShopFrontOffice\Plugins\ModulesPlugin;

/**
 * ...
 *
 * @package RTB\Core\ShopFrontOffice
 * @author Sebastian Bonath <sebastian.bonath@kabs.de>
 * @link https://www.kabs.de
 * @version 1.0.0
 * @since 1.0.0
 */
class IndexController extends Controller
{

    protected $resourceName = 'Home';

    protected $resourceDescription = 'Home Resource';

    protected $isRestricted = false;

    protected $deniedRoles = [
    ];

    public function initialize()
    {
        ModulesPlugin::$hookList[ModulesPlugin::PRECONTENTHOOK] = true;
        parent::initialize();
        // override shared variable for all Index actions
        $this->sharedData['overrideMe'] = true;
    }

    public function indexAction()
    {
        if ($this->session->has("accessDeniedMsg")) {
            $accessDeniedMsg = $this->session->get("accessDeniedMsg");
            $this->view->accessDeniedMsg = $accessDeniedMsg;
            $this->session->remove("accessDeniedMsg");
        }
        $this->sharedData['customVar'] = "custom_var_1";
    }

}
