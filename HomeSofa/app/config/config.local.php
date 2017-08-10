<?php
return new \Phalcon\Config(
    [
    'database'    => [
        'adapter'  => 'Mysql',
        'host'     => 'localhost',
        'username' => 'rtb_shop_fo',
        'password' => 'gfIyKd1ClosKuz2QVauR',
        'dbname'   => 'rtb_shop_front_office',
        'charset'  => 'utf8',
    ],
    'application' => [
        'baseUri'       => 'http://rtb-shop.local/',
        'compileAlways' => false
    ],
    'debug'       => 1
    ]
);
