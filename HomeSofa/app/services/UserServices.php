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

namespace RTB\Core\ShopFrontOffice\Services;

use RTB\Core\WebService\{
    EntityList\CustomerList,
    Entity\Customer as CustomerEntity
};


class UserServices extends Services
{
    const ERROR = false;
    const SUCCESS = true;
    public function createCustomer($customerData)
    {
        $customerEntity = \Phalcon\Di::getDefault()->getClient()->getAdapter()->getCustomerEntity();
        //$session = \Phalcon\Di::getDefault()->getSession();
        if(1) //if($session->get( 'auth')) When Login functionality will be added
        {
            $customerData = new CustomerEntity($customerData);
            $data = $customerEntity->createCustomer($customerData);
            if ($data->id) {
                return $data->id;
            }else{
                return self::ERROR;
            }
        }else{
            return self::ERROR;
        }
    }
    public function getCustomers()
    {
        $customerEntity = \Phalcon\Di::getDefault()->getClient()->getAdapter()->getCustomerEntity();
        $customer = $customerEntity->getCustomers();
        return $customer;
    }
    public function getCustomerById($customerId)
    {
        if($customerId != null){
            $customerEntity = \Phalcon\Di::getDefault()->getClient()->getAdapter()->getCustomerEntity();
            $customer = $customerEntity->getCustomerById($customerId);
            return $customer;
        }
        return self::ERROR;
    }
    public function convertCustomer()
    {
        
    }

}
