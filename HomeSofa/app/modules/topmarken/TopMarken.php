<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace RTB\Core\ShopFrontOffice\Modules\TopMarken;

use RTB\Core\ShopFrontOffice\Modules\Module;

class TopMarken extends Module
{

    protected $name = 'topmarken';

    public function customeHookTopMarken()
    {
        $this->addCss( $this->name );
        return $this->di->getView()->getPartial( $this->name );
    }

}
