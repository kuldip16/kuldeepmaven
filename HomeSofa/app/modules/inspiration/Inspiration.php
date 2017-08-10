<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace RTB\Core\ShopFrontOffice\Modules\Inspiration;

use RTB\Core\ShopFrontOffice\Modules\Module;

class Inspiration extends Module
{

    protected $name = 'inspiration';

    public function render()
    {
        $this->addCss( $this->getName() );
        return parent::render();
    }

}
