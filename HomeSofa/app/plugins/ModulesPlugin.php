<?php

namespace RTB\Core\ShopFrontOffice\Plugins;

use Phalcon\Events\Event;
use RTB\Core\ShopFrontOffice\Services\ModuleServices;
use Phalcon\Mvc\{
    User\Plugin,
    Dispatcher
};

class ModulesPlugin extends Plugin
{

    const HEADTOPHOOK     = 'headTopHook';
    const HEADMETAHOOK    = 'headMetaHook';
    const HEADCSSHOOK     = 'headCssHook';
    const HEADJSHOOK      = 'headJsHook';
    const HEADBOTTOMHOOK  = 'headBottomHook';
    const BODYTOPHOOK     = 'bodyTopHook';
    const PRECONTENTHOOK  = 'preContentHook';
    const POSTCONTENTHOOK = 'postContentHook';
    const BODYJSHOOK      = 'bodyJsHook';
    const BODYBOTTOMHOOK  = 'bodyBottomHook';

    public static $hookList = array(
        self::HEADTOPHOOK     => true,
        self::HEADMETAHOOK    => true,
        self::HEADCSSHOOK     => true,
        self::HEADJSHOOK      => true,
        self::HEADBOTTOMHOOK  => true,
        self::BODYTOPHOOK     => true,
        self::PRECONTENTHOOK  => true,
        self::POSTCONTENTHOOK => true,
        self::BODYJSHOOK      => true,
        self::BODYBOTTOMHOOK  => true,
    );

    public function afterDispatchLoop(Event $event, Dispatcher $dispatcher)
    {
        if ($this->request->isAjax()) {
            //Not execting hooks in ajax request.
            return;
        }
        foreach ( self::$hookList as $hook => $activated ) {
            $this->view->{$hook} = null;
        }

        $pageName = str_replace('Controller', '',
          $dispatcher->getActiveController());

        /**
         * test array
         *  modulesSetup array is getting pulled by getModulesByPage('Home');
         */
        $modulesSetup = ModuleServices::moduleSetup();
        $pageSetup    = [
            'All'          => [
                'CssStuff' => [
                    'hook'     => [self::HEADCSSHOOK],
                    'position' => [self::HEADCSSHOOK => 1],
                    'function' => [self::HEADCSSHOOK => 'dudeWhat'],
                ],
                'AjaxTest' => [
                    'hook'     => [self::POSTCONTENTHOOK],
                    'position' => [self::POSTCONTENTHOOK => 2],
                ]
            ],
            'Home'         => [
                'TopCategories'   => [
                    'hook'     => [self::POSTCONTENTHOOK],
                    'position' => [self::POSTCONTENTHOOK => 3],
                ],
                'YourFavorite'    => [
                    'hook'     => [self::POSTCONTENTHOOK],
                    'position' => [self::POSTCONTENTHOOK => 3],
                ],
                'Prospekt'        => [
                    'hook'     => [self::PRECONTENTHOOK],
                    'position' => [self::PRECONTENTHOOK => 1],
                ],
                'Inspiration'     => [
                    'hook'     => [self::PRECONTENTHOOK],
                    'position' => [self::PRECONTENTHOOK => 2],
                ],
                'Philosophie'     => [
                    'hook'     => [self::PRECONTENTHOOK],
                    'position' => [self::PRECONTENTHOOK => 3],
                ],
                'Guided'          => [
                    'hook'     => [self::PRECONTENTHOOK],
                    'position' => [self::PRECONTENTHOOK => 4],
                ],
                'TopSection'      => [
                    'hook'     => [self::PRECONTENTHOOK],
                    'position' => [self::PRECONTENTHOOK => 5],
                ],
                'SalesBanner'     => [
                    'hook'     => [self::PRECONTENTHOOK],
                    'position' => [self::PRECONTENTHOOK => 6],
                ],
                'Filialen'        => [
                    'hook'     => [self::PRECONTENTHOOK],
                    'position' => [self::PRECONTENTHOOK => 7],
                ],
                'Abverkaufsborse' => [
                    'hook'     => [self::PRECONTENTHOOK],
                    'position' => [self::PRECONTENTHOOK => 8],
                ],
                'TolleSofa'       => [
                    'hook'     => [self::PRECONTENTHOOK],
                    'position' => [self::PRECONTENTHOOK => 9],
                ],
            ],
            'Product'      => [
                'Extras'            => [
                    'hook'     => [self::POSTCONTENTHOOK],
                    'position' => [self::POSTCONTENTHOOK => 1],
                ],
                'OtherCombinations' => [
                    'hook'     => [self::POSTCONTENTHOOK],
                    'position' => [self::POSTCONTENTHOOK => 2],
                ],
                'Recommendation'    => [
                    'hook'     => [self::POSTCONTENTHOOK],
                    'position' => [self::POSTCONTENTHOOK => 3],
                ],
                'SimilarProducts'   => [
                    'hook'     => [self::POSTCONTENTHOOK],
                    'position' => [self::POSTCONTENTHOOK => 4],
                ],
                'TopSeller'         => [
                    'hook'             => [self::POSTCONTENTHOOK, self::PRECONTENTHOOK, self::HEADJSHOOK],
                    'position'         => [self::POSTCONTENTHOOK => 2, self::PRECONTENTHOOK => 2, self::HEADJSHOOK => 1],
                    'function'         => [self::POSTCONTENTHOOK => 'getDataParam', self::HEADJSHOOK => 'addJsToTopParams'],
                    'params'           => true,
                    'getDataParam'     => ['abc' => 111, 'cde' => 222],
                    'addJsToTopParams' => [1, 22, 333, 4444]
                ],
                'YourFavorite'      => [
                    'hook'     => [self::POSTCONTENTHOOK],
                    'position' => [self::POSTCONTENTHOOK => 3],
                ]
            ],
            'SearchResult' => [
                'SearchSlider' => [
                    'hook'     => [self::PRECONTENTHOOK],
                    'position' => [self::PRECONTENTHOOK => 1],
                ],
                'RedAreBest'   => [
                    'hook'     => [self::POSTCONTENTHOOK],
                    'position' => [self::POSTCONTENTHOOK => 1],
                ],
            ],
            'Category'     => [
                'CategoryBanner' => [
                    'hook'     => [self::PRECONTENTHOOK],
                    'position' => [self::PRECONTENTHOOK => 1],
                ],
                'CategorySlider' => [
                    'hook'     => [self::PRECONTENTHOOK],
                    'position' => [self::PRECONTENTHOOK => 2],
                ],
                'Recommendation' => [
                    'hook'     => [self::POSTCONTENTHOOK],
                    'position' => [self::POSTCONTENTHOOK => 1],
                ],
                'Filialen'       => [
                    'hook'     => [self::POSTCONTENTHOOK],
                    'position' => [self::POSTCONTENTHOOK => 2],
                ],
                'RedAreBest'     => [
                    'hook'     => [self::POSTCONTENTHOOK],
                    'position' => [self::POSTCONTENTHOOK => 3],
                ],
            ],
            'MainCategory' => [
                'CategoryBanner' => [
                    'hook'     => [self::PRECONTENTHOOK],
                    'position' => [self::PRECONTENTHOOK => 1],
                ],
                'CategorySlider' => [
                    'hook'     => [self::PRECONTENTHOOK],
                    'position' => [self::PRECONTENTHOOK => 2],
                ],
                'DiscoverNow'    => [
                    'hook'     => [self::PRECONTENTHOOK],
                    'position' => [self::PRECONTENTHOOK => 3],
                ],
                'Recommendation' => [
                    'hook'     => [self::POSTCONTENTHOOK],
                    'position' => [self::POSTCONTENTHOOK => 1],
                ],
                'Filialen'       => [
                    'hook'     => [self::POSTCONTENTHOOK],
                    'position' => [self::POSTCONTENTHOOK => 2],
                ],
                'RedAreBest'     => [
                    'hook'     => [self::POSTCONTENTHOOK],
                    'position' => [self::POSTCONTENTHOOK => 3],
                ],
            ],
            'MyAccount'    => [
                'NewsLetter' => [
                    'hook'     => [self::POSTCONTENTHOOK],
                    'position' => [self::POSTCONTENTHOOK => 1],
                ],
            ],
            'Signup'       => [
                'NewsLetter' => [
                    'hook'     => [self::POSTCONTENTHOOK],
                    'position' => [self::POSTCONTENTHOOK => 1],
                ],
            ],
        ];

        foreach ( $pageSetup as $page_key => $page_val ) {
            foreach ( $page_val as $module_key => $module_val ) {
                if (isset($pageSetup[$page_key][$module_key]) && isset($modulesSetup[$module_key])) {
                    $pageSetup[$page_key][$module_key] = array_merge($modulesSetup[$module_key],
                      $pageSetup[$page_key][$module_key]);
                } else {
                    d("Both array are not in sync!!");
                }
            }
        }

        $moduleOutput = [];

        foreach ( $pageSetup as $page_name => $page_desc ) {
            if ($page_name !== 'All' && $pageName != $page_name) {
                continue;
            }
            foreach ( $page_desc as $module ) {
                if (!$module['active']) {
                    continue;
                }
                $className = 'RTB\Core\ShopFrontOffice\Modules\\'.$module['className'].'\\'.$module['className'];

                if (\class_exists($className) === true) {

                    $moduleInstance = new $className();

                    foreach ( $module['hook'] as $hook ) {
                        $moduleOutput[$hook][$module['position'][$hook]] = null;
                        if (self::$hookList[$hook] === true) {
                            if (isset($module['function']) === true && isset($module['function'][$hook])) {
                                if (isset($module['params']) == true && $module['params'] == true && isset($module[$module['function'][$hook]])) {
                                    $moduleOutput[$hook][$module['position'][$hook]] .= $moduleInstance->{$module['function'][$hook]}($module[$module['function'][$hook]]);
                                } else {
                                    $moduleOutput[$hook][$module['position'][$hook]] .= $moduleInstance->{$module['function'][$hook]}();
                                }
                            } else {
                                $moduleOutput[$hook][$module['position'][$hook]] .= $moduleInstance->render();
                            }
                        }
                    }
                }
            }
        }

        if (\count($moduleOutput) > 0) {
            foreach ( $moduleOutput as $moduleHook => $moduleData ) {
                \ksort($moduleData);

                $sortedModules = '';
                foreach ( $moduleData as $data ) {
                    $sortedModules .= $data;
                }

                $this->di->getView()->setVar($moduleHook, $sortedModules);
            }
        }
    }

}