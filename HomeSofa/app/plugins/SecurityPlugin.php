<?php

namespace RTB\Core\ShopFrontOffice\Plugins;

use Phalcon\Acl;
use Phalcon\Acl\{
    Role,
    Resource,
    Adapter\Memory as AclList
};
use Phalcon\Events\Event;
use Phalcon\Mvc\{
    User\Plugin,
    Dispatcher
};
use RTB\Core\ShopFrontOffice\Models\{
    AclResources,
    AclRoles
};

class SecurityPlugin extends Plugin
{

    public function beforeExecuteRoute(Event $event, Dispatcher $dispatcher)
    {

        // Check whether the "auth" variable exists in session to define the active role
        $auth = $this->session->get("auth");
        
        if (!$auth) {
            $role = "Guest";
        } else {
            //$role = "User";
            $role = "Customer";
        }

        // Take the active controller/action from the dispatcher
        $controller = $dispatcher->getControllerName();
        $action     = $dispatcher->getActionName();

        // Obtain the ACL list
        $acl = $this->getAcl();

        // Check if the Role have access to the controller (resource)

        $allowed = $acl->isAllowed($role, $controller, $action);

        if ($allowed !== (bool) Acl::ALLOW) {

            // If he doesn't khave access forward him to the index controller
            $this->flash->error(
                "You don't have access to this page"
            );
            
            $this->session->set("accessDeniedMsg", "You don't have access to this page");

            $response = new \Phalcon\Http\Response();
            
            $response->redirect(\Phalcon\Di::getDefault()->getConfig()->application->baseUri);
            $response->send();
        }
    }

    public function getAcl()
    {
        $acl = new AclList();

        $acl->setDefaultAction(
            Acl::ALLOW
        );

        // Standard Roles and Resources generation
        $aclRoles = (new AclRoles())->getAllRoles();

        foreach ($aclRoles as $role) {
            $acl->addRole($role);
        }

        $aclResources = (new AclResources())->getAvailableResources();

        foreach ($aclResources as $resourceName => $restrictedRoles) {
            $acl->addResource(strtolower($resourceName), '*');

            foreach ($restrictedRoles as $restrictedRole) {
                $acl->deny($restrictedRole, strtolower($resourceName), '*');
            }
        }

        // If custom roles and resources needs to be created, for example on an action base put it here

        return $acl;
    }
}