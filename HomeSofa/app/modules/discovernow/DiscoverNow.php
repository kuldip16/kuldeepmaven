<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace RTB\Core\ShopFrontOffice\Modules\DiscoverNow;

use RTB\Core\ShopFrontOffice\Modules\Module;

class DiscoverNow extends Module
{

    protected $name = 'discovernow';

    public function render()
    {
        $this->addCss( $this->getName() );
        return parent::render();
    }

}
