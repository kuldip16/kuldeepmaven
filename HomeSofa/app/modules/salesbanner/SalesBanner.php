<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace RTB\Core\ShopFrontOffice\Modules\SalesBanner;

use RTB\Core\ShopFrontOffice\Modules\Module;

class SalesBanner extends Module
{

    protected $name = 'salesbanner';

    protected function init()
    {
        parent::init();

        $this->di->getView()->setVar( 'test2',
          $this->di->getRequest()->get( 'test' ) );
    }

    public function getData()
    {

        $this->di->getView()->setVar( 'function', 'getData' );

        return $this->di->getView()->getPartial( $this->getName() );
    }

    public function render()
    {
        $this->addCss( $this->getName() );
        $this->addJs( $this->getName() );
        return parent::render();
    }

}
