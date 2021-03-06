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
 * @author     Sebastian Bonath <sebastian.bonath@kabs.de>
 * @copyright  Kabs Polsterwelt Online GmbH <sebastian.bonath@kabs.de>, All rights reserved.
 *
 */

namespace RTB\Core\ShopFrontOffice\Models;

use Phalcon\Di;

/**
 * ...
 *
 * @package RTB\Core\ShopFrontOffice
 * @author Sebastian Bonath <sebastian.bonath@kabs.de>
 * @link https://www.kabs.de
 * @version 1.0.0
 * @since 1.0.0
 */
class AclResources
{
    protected $availableResources = null;

    public function __construct()
    {
        $this->availableResources = $this->findAllResources();
    }

    protected function findAllResources()
    {
        $di = Di::getDefault();

        $config = $di->getConfig();

        $directory   = \scandir($config->application->controllerDir);
        $controllers = \array_diff($directory, ['..', '.']);

        $resources = [];

        foreach ($controllers as &$controller) {
            if (\strstr($controller, 'Controller.php')) {
                $controller = str_replace('Controller.php', '', $controller);

                $controllerClass = '\\'.$di->getDispatcher()->getDefaultNamespace().'\\'.$controller.'Controller';

                $controllerInstance = new $controllerClass();

                if($controllerInstance->isRestricted() === true) {
                    $resources[$controllerInstance->getName()] = $controllerInstance->getDeniedRoles();
                }
            }
        }

        return $resources;
    }

    public function getAvailableResources()
    {
        return $this->availableResources;
    }
}