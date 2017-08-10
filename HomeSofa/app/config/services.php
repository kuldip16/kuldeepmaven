<?php

use Phalcon\Mvc\{
    View,
    Dispatcher,
    Url as UrlResolver,
    View\Engine\Volt as VoltEngine,
    Model\MetaData\Memory as MetaDataAdapter
};
use Phalcon\Session\Adapter\Files as SessionAdapter;
use Phalcon\Flash\Direct as Flash;
use Phalcon\Events\Manager as EventsManager;
use RTB\Core\ShopFrontOffice\Plugins\{
    SecurityPlugin,
    ModulesPlugin
};
use RTB\Core\WebService\Client;

/**
 * Shared configuration service
 */
$di->set('config', function () {
    $mainConfig = require APP_PATH . '/config/config.php';
    if (file_exists(APP_PATH . '/config/config.' . APPLICATION_ENV . '.php')) {
        $envConfig = require APP_PATH . '/config/config.' . APPLICATION_ENV . '.php';
        $mainConfig->merge($envConfig);
    }
    return $mainConfig;
});

$config = $di->getConfig();

/**
 * Shared loader service
 */
$di->set('loader', function () use($config) {
    /**
     * Include Autoloader
     */
    include APP_PATH . '/config/loader.php';
    return $loader;
});

/**
 * Shared dispatcher service
 */
$di->setShared('dispatcher', function() {
    // Create an events manager
    $eventsManager = new EventsManager();

    // Listen for events produced in the dispatcher using the Security plugin
    $eventsManager->attach(
            "dispatch:beforeExecuteRoute", new SecurityPlugin()
    );

    $eventsManager->attach(
            "dispatch:afterDispatchLoop", new ModulesPlugin()
    );

    $dispatcher = new Dispatcher();
    $dispatcher->setDefaultNamespace(
            'RTB\Core\ShopFrontOffice\Controllers\Pages'
    );

    // Assign the events manager to the dispatcher
    $dispatcher->setEventsManager($eventsManager);
    return $dispatcher;
});

/**
 * The URL component is used to generate all kind of urls in the application
 */
$di->setShared('url', function () use($config) {
    $url = new UrlResolver();
    $url->setBaseUri($config->application->baseUri);
    return $url;
});

/**
 * Setting up the view component
 */
$di->setShared('view', function () use($config) {
    $view = new View();
    $view->setViewsDir($config->application->viewsDir);
    $view->registerEngines([
        '.volt' => function ($view, $di) use($config) {
            $volt = new VoltEngine($view, $di);
            $volt->setOptions([
                'compiledPath' => $config->application->cacheDir,
                'compiledSeparator' => '_',
                'compileAlways' => $config->application->compileAlways
            ]);
            return $volt;
        },
        '.phtml' => 'Phalcon\Mvc\View\Engine\Php'
    ]);
    return $view;
});

/**
 * Database connection is created based in the parameters defined in the configuration file
 */
$di->set('db', function () use($config) {
    $dbConfig = $config->database->toArray();

    $adapter = $dbConfig['adapter'];
    unset($dbConfig['adapter']);

    $class = 'Phalcon\Db\Adapter\Pdo\\' . $adapter;
    return new $class($dbConfig);
});


/**
 * If the configuration specify the use of meta data adapter use it or use memory otherwise
 */
$di->set('modelsMetadata', function () {
    return new MetaDataAdapter();
});

/**
 * Register the session flash service with the Twitter Bootstrap classes
 */
$di->setShared('flash', function () {
    return new Flash([
        'error' => 'alert alert-danger',
        'success' => 'alert alert-success',
        'notice' => 'alert alert-info',
        'warning' => 'alert alert-warning'
    ]);
});

/**
 * Start the session the first time some component request the session service
 */
$di->set('session', function () {
    $session = new SessionAdapter();
    $session->start();
    return $session;
});

/**
 * Shared router service
 */
$di->set('router', function() {
    return require APP_PATH . '/config/routes.php';
});
