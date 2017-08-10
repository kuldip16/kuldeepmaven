<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace RTB\Core\ShopFrontOffice\Modules\TopSeller;

use RTB\Core\ShopFrontOffice\Modules\Module;

class TopSeller extends Module
{

    protected $name = 'topseller';

    protected function init()
    {
        parent::init();
        \Phalcon\Di::getDefault()->getView()->setVar( 'test2',
          \Phalcon\Di::getDefault()->getRequest()->get( 'test' ) );
    }

    public function addJsToTop()
    {
        return $this->di->getView()->getPartial( $this->getName() . '.js' );
    }

    public function addJsToTopParams( $param )
    {
        return $this->di->getView()->getPartial( $this->getName() . '.js' );
    }

    public function getData()
    {
        $this->addJs( $this->getName() );
        $this->addCss( $this->getName() );
        $this->di->getView()->setVar( 'function', 'getData' );
        return $this->di->getView()->getPartial( "more_topseller" );
    }

    public function getDataParam( $param )
    {
        $this->addJs( $this->getName() );
        $this->addCss( $this->getName() );
        $this->di->getView()->setVar( 'function', 'getData' );
        return $this->di->getView()->getPartial( "more_topseller" );
    }

    public function customeHookTopSeller()
    {
        $this->addJs( $this->getName() );
        $this->addCss( $this->getName() );
        return $this->di->getView()->getPartial( $this->name );
    }

}
