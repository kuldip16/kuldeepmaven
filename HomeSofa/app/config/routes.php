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
use Phalcon\Mvc\Router;

$router = new Router();

$router->removeExtraSlashes(true);
/**
 * In future, we will replace following by 'ErrorController-show404 Action' from Ticket-handle404 instead of IndexController
 */
$router->add(
  '/([a-zA-Z0-9\_\-]+)(/[a-zA-Z0-9\_\-]+)*',
  [
    'controller' => 'index',
    'action'     => 'index'
  ]
)->setName('DefaultPage');

$router->add(
  "/modules/{moduleName:[a-zA-Z\-]+}/{handler:[a-zA-Z\-]+}/{method:[a-zA-Z\-]+}",
  [
    'controller' => 'modules',
    'action'     => 'index'
  ]
);

$router->add(
  '/{cat:[a-zA-Z0-9\_\-]+}',
  [
    'controller' => 'MainCategory',
    'action'     => 'index'
  ]
)->beforeMatch(
  function ($uri) {
    $requestedUrl = trim($uri, '/');
    if (\Phalcon\Di::getDefault()->getClient()->getAdapter()->getCategoryEntity()->mainCategoryExists($requestedUrl)) {
        return true;
    }
    return false;
}
)->setName('MainCategory');

$router->add(
  '/{cat:[a-zA-Z0-9\_\-]+}/{subcat:[a-zA-Z0-9\_\-]+}',
  [
    'controller' => 'category',
    'action'     => 'index'
  ]
)->beforeMatch(
  function ($uri) {
    $array      = explode('/', trim($uri, '/'));
    $catName    = $array[0];
    $subCatName = $array[1];
    if (\Phalcon\Di::getDefault()->getClient()->getAdapter()->getCategoryEntity()->subCategoryExists($catName,
        $subCatName)) {
        return true;
    }
    return false;
}
)->setName('Category');

$router->add(
  '/', [
    'controller' => 'index',
    'action'     => 'index'
  ]
)->setName('Home');

$router->add(
  '/productconfigurator',
  [
    'controller' => 'productconfigurator',
    'action'     => 'index'
  ]
)->setName('productconfigurator');

$router->add(
  '/(m|M)(e|E)(i|I)(n|N)(\-)(k|K)(o|O)(n|N)(t|T)(o|O)',
  [
    'controller' => 'myaccount',
    'action'     => 'index'
  ]
)->setName('Mein-Konto');

$router->add(
  '/(w|W)(a|A)(r|R)(e|E)(n|N)(k|K)(o|O)(r|R)(b|B)',
  [
    'controller' => 'shoppingcart',
    'action'     => 'index'
  ]
)->setName('Warenkorb');

$router->add(
  '/(w|W)(u|U)(n|N)(s|S)(c|C)(h|H)(z|Z)(e|E)(t|T)(t|T)(e|E)(l|L)',
  [
    'controller' => 'wishlist',
    'action'     => 'index'
  ]
)->setName('Wunschzettel');

$router->add(
  '/produkt/{productName:[a-zA-Z0-9\_\-]+}',
  [
    'controller' => 'product',
    'action'     => 'index'
  ]
)->convert(
  "productName",
  function ($productName) {
    return \Phalcon\Di::getDefault()->getClient()->getAdapter()->getProductEntity()->getByName($productName);
}
)->setName('produkt');
$router->add(
  '/(s|S)(u|U)(c|C)(h|H)(e|E)',
  [
    'controller' => 'searchresult',
    'action'     => 'index'
  ]
)->setName('Suche');


$router->add(
  '/(p|P)(r|R)(o|O)(s|S)(p|P)(e|E)(k|K)(t|T)(e|E)',
  [
    'controller' => 'literature',
    'action'     => 'index'
  ]
)->setName('Prospekte');

$router->add(
  '/(i|I)(n|N)(s|S)(p|P)(i|I)(r|R)(a|A)(t|T)(i|I)(o|O)(n|N)(e|E)(n|N)',
  [
    'controller' => 'inspiration',
    'action'     => 'index'
  ]
)->setName('Inspirationen');

$router->add(
  '/(m|M)(a|A)(r|R)(k|K)(e|E)(n|N)',
  [
    'controller' => 'brands',
    'action'     => 'index'
  ]
)->setName('Marken');

$router->add(
  '/(s|S)(e|E)(r|R)(v|V)(i|I)(c|C)(e|E)',
  [
    'controller' => 'Service',
    'action'     => 'index'
  ]
)->setName('Service');

$router->add(
  '/(b|B)(e|E)(r|R)(a|A)(t|T)(u|U)(n|N)(g|G)',
  [
    'controller' => 'consulting',
    'action'     => 'index'
  ]
)->setName('Beratung');

$router->add(
  '/(f|F)(a|A)(q|Q)', [
    'controller' => 'faq',
    'action'     => 'index'
  ]
)->setName('FAQ');

$router->add(
  '/(w|W)(i|I)(r|R)(\-)(u|U)(e|E)(b|B)(e|E)(r|R)(\-)(u|U)(n|N)(s|S)'
  , [
    'controller' => 'aboutus',
    'action'     => 'index'
  ]
)->setName('Wir-Ueber-Uns');

$router->add(
  '/(r|R)(e|E)(g|G)(i|I)(s|S)(t|T)(r|R)(i|I)(e|E)(r|R)(e|E)(n|N)',
  [
    'controller' => 'signup',
    'action'     => 'index'
  ]
)->setName('Registrieren');

return $router;
