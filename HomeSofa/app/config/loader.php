<?php
$loader = new \Phalcon\Loader();

/**
 * We're a registering a set of directories taken from the configuration file
 */
$loader->registerNamespaces(
    [
        'RTB\Core\ShopFrontOffice'             => APP_PATH.'/',
        'RTB\Core\ShopFrontOffice\Controllers' => APP_PATH.'/controllers/',
        'RTB\Core\ShopFrontOffice\Models'      => APP_PATH.'/models/',
        'RTB\Core\ShopFrontOffice\Plugins'     => APP_PATH.'/plugins/',
        'RTB\Core\ShopFrontOffice\Modules'     => APP_PATH.'/modules/',
        'RTB\Core\ShopFrontOffice\Tests'       => APP_PATH.'/../tests/',
        'RTB\Core\ShopFrontOffice\Services'     => APP_PATH.'/services/',        
    ]
);

$loader->register();