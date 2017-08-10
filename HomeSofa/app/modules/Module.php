<?php
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

namespace RTB\Core\ShopFrontOffice\Modules;

use Phalcon\Http\Request;

abstract class Module implements ModuleInterface
{

    protected $assetsJsPath     = '';
    protected $assetsCssPath    = '';
    protected $name             = '';
    protected $di               = null;
    protected $request          = null;
    protected $activeController = null;
    private $initialized        = false;

    public function __construct()
    {
        $this->di = \Phalcon\Di::getDefault();

        $this->request = new Request();

        $this->init();
    }

    protected function init()
    {
        $this->assetsJsPath = _RTB_JS_MODULE_DIR_.$this->name.'/';

        $this->assetsCssPath = _RTB_CSS_MODULE_DIR_.$this->name.'/';

        $this->activeController = $this->di->getDispatcher()->getActiveController();

        if ($this->di->getView() instanceof \Phalcon\Mvc\View && !empty($this->name)) {
            $viewsDir = $this->di->getView()->getViewsDir();

            if (\is_array($viewsDir) === false) {
                $viewsDir   = [];
                $viewsDir[] = $this->di->getView()->getViewsDir();
            }
            $location = __DIR__.'/'.$this->name.'/views/';
            if (!in_array($location, $viewsDir)) {
                $viewsDir[] = $location;
            }

            $this->di->getView()->setViewsDir($viewsDir);

            $this->initialized = true;
        }
    }

    public function getName(): string
    {
        return $this->name;
    }

    public function setName(string $name)
    {
        $this->name = $name;
    }

    public function render()
    {
        if ($this->initialized === false) {
            $this->init();
        }

        $this->di->getView()->setVar('function', 'render');

        return $this->di->getView()->getPartial($this->getName());
    }

    public function addCss($file, $local = true)
    {
        if ($local) {
            $this->activeController->assets->addCss($this->assetsCssPath.$file.'.css');
        } else {
            $this->activeController->assets->addCss($file, false);
        }
    }

    public function addJs($file, $local = true)
    {
        if ($local) {
            $this->activeController->assets->addJs($this->assetsJsPath.$file.'.js');
        } else {
            $this->activeController->assets->addJs($file, false);
        }
    }

}