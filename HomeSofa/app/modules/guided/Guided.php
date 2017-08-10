<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace RTB\Core\ShopFrontOffice\Modules\Guided;

use RTB\Core\ShopFrontOffice\Modules\Module;

class Guided extends Module
{

    protected $name = 'guided';

    public function render()
    {
        $this->addCss( $this->getName() );
        return parent::render();
    }

}
