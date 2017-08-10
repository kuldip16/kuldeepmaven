<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace RTB\Core\ShopFrontOffice\Modules\RedAreBest;

use RTB\Core\ShopFrontOffice\Modules\Module;

class RedAreBest extends Module
{

    protected $name = 'redarebest';

    public function render()
    {
        $this->addCss( $this->getName() );
        return $this->di->getView()->getPartial( $this->getName() );
    }

}
