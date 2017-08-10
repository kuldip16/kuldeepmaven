<?php
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace RTB\Core\ShopFrontOffice\Modules\SimilarProducts;

use RTB\Core\ShopFrontOffice\Modules\Module;

class SimilarProducts extends Module
{
    protected $name = 'similarproducts';
    
    protected function init()
    {
        parent::init();

        $this->di->getView()->setVar('test2', $this->di->getRequest()->get('test'));
    }

    public function getData() {

        $this->di->getView()->setVar('function', 'getData');

        return $this->di->getView()->getPartial($this->getName());
        
    }

}