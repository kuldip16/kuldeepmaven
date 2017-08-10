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

/**
 * ...
 *
 * @package RTB\Core\ShopFrontOffice
 * @author Sebastian Bonath <sebastian.bonath@kabs.de>
 * @link https://www.kabs.de
 * @version 1.0.0
 * @since 1.0.0
 */
class AclRoles
{
    /**
     * Internal Roles are roles which has been authenticated:
     * Logged in users/customers
     *
     * @var array
     */
    protected $internalRoles = [];

    /**
     * External Roles are roles which has not been authenticated so far.
     * Not logged in users/customers
     *
     * @var array
     */
    protected $externalRoles = [];

    const GUESTROLE    = 'Guest';
    const CONTACTROLE  = 'Contact';
    const CUSTOMERROLE = 'Customer';

    public function __construct()
    {

        $this->externalRoles[] = self::GUESTROLE;

        $this->internalRoles[] = self::CONTACTROLE;
        $this->internalRoles[] = self::CUSTOMERROLE;
    }

    public function getAllRoles()
    {
        return \array_merge($this->externalRoles, $this->internalRoles);
    }
}