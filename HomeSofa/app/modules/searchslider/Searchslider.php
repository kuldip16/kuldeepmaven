<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace RTB\Core\ShopFrontOffice\Modules\SearchSlider;

use RTB\Core\ShopFrontOffice\Modules\Module;

class SearchSlider extends Module
{

    protected $name = 'searchslider';

    public function render()
    {
        $this->addCss( $this->getName() );
        $this->addJs( $this->getName() );
        return $this->di->getView()->getPartial( $this->getName() );
    }

}
