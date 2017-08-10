<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace RTB\Core\ShopFrontOffice\Modules\AjaxTest;

use RTB\Core\ShopFrontOffice\Modules\Module;

class AjaxTest extends Module
{

    protected $name = 'ajaxtest';

    public function test()
    {
        return $this->di->getView()->getPartial( $this->getName() );
    }

    public function render()
    {  
        $this->addJs( $this->getName() );
    }

}
