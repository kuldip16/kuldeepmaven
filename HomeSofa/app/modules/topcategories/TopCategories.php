<?php
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace RTB\Core\ShopFrontOffice\Modules\TopCategories;

use RTB\Core\ShopFrontOffice\Modules\Module;

class TopCategories extends Module
{

    protected $name = 'topcategories';

    public function customeHookTopKategories()
    {
        $this->addCss($this->name);
        return $this->di->getView()->getPartial($this->name);
    }

}