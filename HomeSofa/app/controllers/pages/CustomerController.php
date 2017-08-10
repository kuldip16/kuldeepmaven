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
use RTB\Core\WebService\{
    EntityList\CustomerList,
    Entity\Customer as CustomerEntity
};

/**
 * ...
 *
 * @package RTB\Core\ShopFrontOffice
 * @author Sebastian Bonath <sebastian.bonath@kabs.de>
 * @link https://www.kabs.de
 * @version 1.0.0
 * @since 1.0.0
 */
class CustomerController extends Controller
{
    public function initialize() {
        parent::initialize();
        $adapter = $this->client->getAdapter();
        $customerInstance = $adapter->getCustomerEntity();
        $this->setDependencies($customerInstance);
    }
    public function setDependencies($customerInstance)
    {
        $this->customerInstance = $customerInstance;
    }
    public function createCustomer($customer_data)
    {
        $this->initialize();
        //$session = $this->session;
        if(1) //if($session->get( 'auth')) When Login functionality will be added
        {
            $customer_data = new CustomerEntity($customer_data);
            $data = $this->customerInstance->createCustomer($customer_data);
            if ($data->__get('response')) {
                $customer_id = $data->__get('id');
                return $customer_id;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    public function getCustomers()
    {
        $customer = $this->customerInstance->getCustomers();
        return $customer;
    }
    public function getCustomerById($customer_id)
    {
        $customer = $this->customerInstance->getCustomersById($customer_id);
        return $customer;
    }
}