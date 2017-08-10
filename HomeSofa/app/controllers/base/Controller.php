<?php

namespace RTB\Core\ShopFrontOffice\Controllers\Base;

use Phalcon\Mvc\Controller as PhalconController;

class Controller extends PhalconController implements \Phalcon\Acl\ResourceInterface
{

    protected $locale = null;

    protected $metaData = [
        'title' => null,
        'keywords' => null,
        'description' => null,
        'robots' => null
    ];

    protected $isRestricted = false;

    protected $deniedRoles = [];

    protected $resourceName = 'Controller';

    protected $resourceDescription = null;

    protected $baseUri = null;

    protected $sharedData;

    protected $executeSetBasicAssets = true;

    public function isRestricted()
    {
        return $this->isRestricted;
    }

    public function getDeniedRoles()
    {
        return $this->deniedRoles;
    }

    public function initialize()
    {
        if ( !$this->request->isAjax() && $this->executeSetBasicAssets == true) {
            $this->setBasicAssets();
        }
        $this->locale = \Locale::acceptFromHttp( $_SERVER["HTTP_ACCEPT_LANGUAGE"] );

        $this->baseUri = \Phalcon\Di::getDefault()->getConfig()->application->baseUri;

        $samle_main_category_url = $this->url->get( "cat1" );

        $samle_sub_category_url = $this->url->get( "cat1/cat4" );

        $this->view->setVars(
          [
              'srcHome' => $this->url->get( "" ),
              'registrieren' => $this->url->get( "registrieren" ),
              'srcMeinKonto' => $this->url->get( "mein-konto" ),
              'srcWarenkorb' => $this->url->get( "warenkorb" ),
              'srcWunschzettel' => $this->url->get( "Wunschzettel" ),
              'srcSuche' => $this->url->get( "Suche" ),
              'pageName' => $this->resourceName
          ]
        );

        if ( !$this->session->has( "accessDeniedMsg" ) ) {
            $this->view->accessDeniedMsg = null;
        }

        // set shared data for all actions
        $this->sharedData = [
            'baseUri' => $this->di->getConfig()->application->baseUri,
            'overrideMe' => false
        ];
    }

    public function getName()
    {
        return $this->resourceName;
    }

    public function getDescription()
    {
        return $this->resourceDescription;
    }

    public function __toString()
    {
        return $this->getName();
    }

    public function addCss( $path, $local = true, $collection_name = '' )
    {
        if ( $local ) {
            $path = strtolower( $path );
            $this->assets->addCss( _RTB_CSS_DIR_ . $path . '.css' );
        } else {
            $this->assets->addCss( $path, false );
        }
    }

    public function addJs( $path, $local = true, $collection_name = '' )
    {
        if ( $local ) {
            $path = strtolower( $path );
            $this->assets->addJs( _RTB_JS_DIR_ . $path . '.js' );
        } else {
            $this->assets->addCss( $path, false );
        }
    }

    public function afterExecuteRoute( \Phalcon\Mvc\Dispatcher $dispatcher )
    {
        // Executed after every found action
        $this->view->setVar( 'sharedData', $this->sharedData );
    }
    /**
     * params: none
     * Desc: to include global.css,and global.js
     * and add dedicated css and js file to each controller.     * 
     **/
    protected function setBasicAssets()
    {
        $this->addCss( 'global' );
        $this->addCss( $this->getName() );
        $this->addJs( 'global' );
        $this->addJs( $this->getName() );
    }

}
