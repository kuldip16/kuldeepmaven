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

namespace RTB\Core\ShopFrontOffice\Services;

use RTB\Core\ShopFrontOffice\Modules\ModuleInterface;

class ModuleServices extends Services
{

    public static function moduleSetup()
    {
        $id = 0;
        return [
            'Extras'            => [
                'id'        => ++$id,
                'name'      => 'Extras',
                'className' => 'Extras',
                'active'    => true,
                'device'    => null,
            ],
            'NewsLetter'        => [
                'id'        => ++$id,
                'name'      => 'News Letter',
                'className' => 'NewsLetter',
                'active'    => true,
                'device'    => null,
            ],
            'OtherCombinations' => [
                'id'        => ++$id,
                'name'      => 'Other Combinations',
                'className' => 'OtherCombinations',
                'active'    => true,
                'device'    => null,
            ],
            'Recommendation'    => [
                'id'        => ++$id,
                'name'      => 'Recommendation',
                'className' => 'Recommendation',
                'active'    => true,
                'device'    => null,
            ],
            'SalesBanner'       => [
                'id'        => ++$id,
                'name'      => 'Sales Banner',
                'className' => 'SalesBanner',
                'active'    => true,
                'device'    => null,
            ],
            'SimilarProducts'   => [
                'id'        => ++$id,
                'name'      => 'Similar Products',
                'className' => 'SimilarProducts',
                'active'    => true,
                'device'    => null,
            ],
            'TopBrands'         => [
                'id'        => ++$id,
                'name'      => 'Top Brands',
                'className' => 'TopBrands',
                'active'    => true,
                'device'    => null,
            ],
            'TopCategories'     => [
                'id'        => ++$id,
                'name'      => 'Top Categories',
                'className' => 'TopCategories',
                'active'    => true,
                'device'    => null,
            ],
            'TopSeller'         => [
                'id'        => ++$id,
                'name'      => 'Top Seller',
                'className' => 'TopSeller',
                'active'    => true,
                'device'    => null,
            ],
            'YourFavorite'      => [
                'id'        => ++$id,
                'name'      => 'Your Favorite',
                'className' => 'YourFavorite',
                'active'    => true,
                'device'    => null,
            ],
            'CssStuff'          => [
                'id'        => ++$id,
                'name'      => 'Put Css stuff in head',
                'className' => 'CssStuff',
                'active'    => true,
                'device'    => null,
            ],
            'Prospekt'          => [
                'id'        => ++$id,
                'name'      => 'Prospekt',
                'className' => 'Prospekt',
                'active'    => true,
                'device'    => null,
            ],
            'Inspiration'       => [
                'id'        => ++$id,
                'name'      => 'Inspiration',
                'className' => 'Inspiration',
                'active'    => true,
                'device'    => null,
            ],
            'Philosophie'       => [
                'id'        => ++$id,
                'name'      => 'Philosophie',
                'className' => 'Philosophie',
                'active'    => true,
                'device'    => null,
            ],
            'Guided'            => [
                'id'        => ++$id,
                'name'      => 'Guided',
                'className' => 'Guided',
                'active'    => true,
                'device'    => null,
            ],
            'Filialen'          => [
                'id'        => ++$id,
                'name'      => 'Filialen',
                'className' => 'Filialen',
                'active'    => true,
                'device'    => null,
            ],
            'Abverkaufsborse'   => [
                'id'        => ++$id,
                'name'      => 'Abverkaufsborse',
                'className' => 'Abverkaufsborse',
                'active'    => true,
                'device'    => null,
            ],
            'TolleSofa'         => [
                'id'        => ++$id,
                'name'      => 'Tollesofa',
                'className' => 'Tollesofa',
                'active'    => true,
                'device'    => null,
            ],
            'CategoryBanner'    => [
                'id'        => ++$id,
                'name'      => 'Categorybanner',
                'className' => 'Categorybanner',
                'active'    => true,
                'device'    => null,
            ],
            'CategorySlider'    => [
                'id'        => ++$id,
                'name'      => 'Categoryslider',
                'className' => 'Categoryslider',
                'active'    => true,
                'device'    => null,
            ],
            'RedAreBest'        => [
                'id'        => ++$id,
                'name'      => 'Redarebest',
                'className' => 'Redarebest',
                'active'    => true,
                'device'    => null,
            ],
            'SearchSlider'      => [
                'id'        => ++$id,
                'name'      => 'Searchslider',
                'className' => 'Searchslider',
                'active'    => true,
                'device'    => null,
            ],
            'TopSection'        => [
                'id'        => ++$id,
                'name'      => 'Put all TopSection together',
                'className' => 'TopSection',
                'active'    => true,
                'device'    => null,
            ], 
            'TopMarken'        => [
                'id'        => ++$id,
                'name'      => 'TopMarken',
                'className' => 'TopMarken',
                'active'    => true,
                'device'    => null,
            ],
            'AjaxTest'          => [
                'id'        => ++$id,
                'name'      => 'Put Css stuff in head',
                'className' => 'AjaxTest',
                'active'    => true,
                'device'    => null,
            ],
            'DiscoverNow'       => [
                'id'        => ++$id,
                'name'      => 'DiscoverNow',
                'className' => 'DiscoverNow',
                'active'    => true,
                'device'    => null,
            ],
        ];
    }

    public static function executeHook($module, $handler, $method, $param = null): string
    {
        $moduleSetup = self::moduleSetup();
        if (!$moduleSetup[$handler]['active']) {
            return false;
        }
        $output    = null;
        $class     = '\RTB\Core\ShopFrontOffice\Modules\\'.$module.'\\'.$handler;
        $moduleObj = new $class();
        if ($moduleObj instanceof ModuleInterface) {
            if ($param != null) {
                $output = $moduleObj->{$method}($param);
            } else {
                $output = $moduleObj->{$method}();
            }
            return $output;
        }
    }

}