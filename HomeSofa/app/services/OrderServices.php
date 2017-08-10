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
 * @author     Vivek Bhattacharya <vivek.bhattacharya@webvirtue.com>
 * @copyright  Kabs Polsterwelt Online GmbH <sebastian.bonath@kabs.de>, All rights reserved.
 *
 */

namespace RTB\Core\ShopFrontOffice\Services;

class OrderServices extends Services {

    const ERROR = false;
    const SUCCESS = true;

    public function addOrder($customerId, $billingAddressId, $shippingAddressId, $statusId) {
        if ($customerId != null && $billingAddressId != null && $shippingAddressId != null && $statusId != null) {
            $orderDataArray = array(
                'CustomerId' => $customerId,
                'BillingAddressId' => $billingAddressId,
                'ShippingAddressId' => $shippingAddressId,
                'StatusId' => $statusId
            );
            $orderDataEntity = new \RTB\Core\WebService\Entity\Order($orderDataArray);
            $orderEntity = \Phalcon\Di::getDefault()->getClient()->getAdapter()->getOrderEntity();
            $data = $orderEntity->createOrder($orderDataEntity);
            if ($data->id) {
                return $data->id;
            }
        }
        return self::ERROR;
    }

    public function getOrdersByCustomerId($customerId) {
        if ($customerId != null) {
            $orderEntity = \Phalcon\Di::getDefault()->getClient()->getAdapter()->getOrderEntity();
            $orders = $orderEntity->getSalesOrderByCustomerId($customerId);
            return $orders;
        }
        return self::ERROR;
    }

    public function getOrders() {
        $orderEntity = \Phalcon\Di::getDefault()->getClient()->getAdapter()->getOrderEntity();
        $orders = $orderEntity->getSalesOrders();
        return $orders;
    }

    public function getOrderById($orderId) {
        if ($orderId != null) {
            $orderEntity = \Phalcon\Di::getDefault()->getClient()->getAdapter()->getOrderEntity();
            $order = $orderEntity->getSalesOrderById($orderId);
            return $order;
        }
        return self::ERROR;
    }

    public function getOrderStatus($orderId) {
        if ($orderId != null) {
            $orderEntity = \Phalcon\Di::getDefault()->getClient()->getAdapter()->getOrderEntity();
            $orderStatusWeb = $orderEntity->getOrderStatus($orderId);
            if ($orderStatusWeb != '') {
                $orderStatus = $orderStatusWeb->orderStatus;
            } else {
                $orderStatus = null;
            }
            return $orderStatus;
        }
        return self::ERROR;
    }

}
