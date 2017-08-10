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

namespace RTB\Core\ShopFrontOffice;

use Phalcon\Di\FactoryDefault;

/**
 * ...
 *
 * @package RTB\Core\ShopFrontOffice
 * @author Sebastian Bonath <sebastian.bonath@kabs.de>
 * @link https://www.kabs.de
 * @version 1.0.0
 * @since 1.0.0
 */
class Bootstrap
{

    public static function run()
    {
        date_default_timezone_set('Europe/Berlin');

        if (APPLICATION_ENV !== 'production') {
            $debug = new \Phalcon\Debug();
            $debug->listen();
        }
        /**
         * The FactoryDefault Dependency Injector automatically register the right services providing a full stack framework
         */
        $di = new FactoryDefault();

        /**
         * Read services
         */
        include APP_PATH . "/config/services.php";

        require_once VENDOR_PATH . '/autoload.php';

        /**
         * Call the autoloader service.  We don't need to keep the results.
         */
        $di->getLoader();

        \Phalcon\Di::setDefault($di);

        /**
         * Handle the request
         */
        $application = new \Phalcon\Mvc\Application($di);

        echo $application->handle()->getContent();
    }

}
