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

namespace RTB\Core\ShopFrontOffice\Modules\TopBrands;

use RTB\Core\ShopFrontOffice\Modules\Module;

class TopBrands extends Module
{

    protected $name = 'topbrands';

    protected function init()
    {
        parent::init();

        $this->di->getView()->setVar('test2',
          $this->di->getRequest()->get('test'));
    }

    public function getData()
    {

        $this->di->getView()->setVar('function', 'getData');

        return $this->di->getView()->getPartial($this->getName());
    }

    public function customeHookTopBrands()
    {
        return $this->di->getView()->getPartial($this->name);
    }

}