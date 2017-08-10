<?php

defined('APP_PATH') || define('APP_PATH', realpath('.'));

return new \Phalcon\Config([
    'database' => [
        'adapter' => 'Mysql',
        'host' => 'localhost',
        'username' => 'rtb_shop_fo',
        'password' => 'FshvFAoP7JslCnHIgSkp',
        'dbname' => 'rtb_shop_front_office',
        'charset' => 'utf8',
    ],
    'application' => [
        'viewsDir' => APP_PATH . '/views/',
        'cacheDir' => APP_PATH . '/cache/',
        'controllerDir' => APP_PATH . '/controllers/pages/',
        'baseUri' => 'http://rtb-shop.local/',
        //Volt Compile Option
        'compileAlways' => false,
    ]]
);
