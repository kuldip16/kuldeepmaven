<?php

/**
 * Copyright (c) 2016 Kabs Polsterwelt Online GmbH <sebastian.bonath@kabs.de>
 * All rights reserved.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT  * NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER ORCONTRIBUTORS
 * BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY,
 * OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * @author     Shobhit Verma <shobhit.verma@webvirtue.com>
 * @copyright  Kabs Polsterwelt Online GmbH <sebastian.bonath@kabs.de>, All rights reserved.
 *
 */

namespace RTB\Core\ShopFrontOffice\Controllers\Pages;

use RTB\Core\ShopFrontOffice\{
    Controllers\Base\Controller,
    Modules\ModuleInterface
};

/**
 * ...
 *
 * @package RTB\Core\ShopFrontOffice
 * @author Sebastian Bonath <sebastian.bonath@kabs.de>
 * @link https://www.kabs.de
 * @version 1.0.0
 * @since 1.0.0
 */
class ModulesController extends Controller
{

    protected static $handler;

    protected static $moduleName;

    protected static $moduleHandler;

    protected static $moduleAction;

    protected $isRestricted = false;

    protected $deniedRoles = [
    ];

    protected $resourceName = 'Modules';

    protected $resourceDescription = 'Modules Resource';

    public function initialize()
    {
        $this->executeSetBasicAssets =false;
        parent::initialize();
        self::$moduleName = $this->dispatcher->getParam( "moduleName" );
        self::$moduleHandler = $this->dispatcher->getParam( "handler" );
        self::$moduleAction = $this->dispatcher->getParam( "method" );
        if ( self::$moduleName == '' || self::$moduleHandler == '' || self::$moduleAction == '' ) {
            d( "Please follow this formate to call a handler action: base_uri\modules\<moduleName>\<file_name>\<method_name>" );
        }
    }

    public function indexAction()
    {
        $handler = $this->getHandler();
        if ( !method_exists( $handler, self::$moduleAction ) ) {
            d( "There is no method:" . self::$moduleAction . "(), in module:" . self::$moduleName . " handler:" . self::$moduleHandler );
        }
        return $handler->{self::$moduleAction}();
    }

    public function getHandler(): ModuleInterface
    {
        if ( !self::$handler instanceof ModuleInterface ) {
            $class = '\RTB\Core\ShopFrontOffice\Modules\\' . self::$moduleName . '\\' . self::$moduleHandler;
            self::$handler = new $class();
        }
        return self::$handler;
    }

    public function resetHandler()
    {
        self::$handler = null;
    }

    public function getModuleName(): string
    {
        return self::$moduleName;
    }

    public function getModuleAction(): string
    {
        return self::$moduleAction;
    }

    public function getCurrentHandler()
    {
        if ( !is_null( self::$handler ) ) {
            return self::$handler;
        }
        return null;
    }

}
