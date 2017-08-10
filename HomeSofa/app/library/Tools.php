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

namespace RTB\Core\ShopFrontOffice\Library;

class Tools
{

    /**
     * Display an error with detailed object
     *
     * @param mixed $object
     * @param bool $die
     * @return $object if $kill = false;
     */
    public static function dieObject( $object, $die )
    {
        echo '<xmp style="text-align: left;">';
        print_r( $object );
        echo '</xmp><br />';
        if ( $die ) {
            die( 'END' );
        }
        ob_get_level() && ob_flush(); // Functional replacement for "echo $var" without the need to disable something or to die.
        return $object;
    }

    /**
     * ALIAS OF dieObject() - Display an error with detailed object
     *
     * @param object $object Object to display
     */
    public static function d( $object )
    {
        return (self::dieObject( $object, TRUE ));
    }

    /**
     * ALIAS OF dieObject() - Display an error with detailed object but don't stop the execution
     *
     * @param object $object Object to display
     */
    public static function p( $object )
    {
        return (self::dieObject( $object, false ));
    }

     /**
     * Delete Volt Php files form Cache file
     *
     * @param object of FactoryDefault Di
     */
    public static function clearVoltCache( $di )
    {
        $dir = $di->get( 'config' )->application->cacheDir;
        $list = scandir( $dir );
        foreach ( $list as $file ) {
            $path_info = pathinfo( $file, PATHINFO_EXTENSION );
            if ( ($path_info == 'php') && ($file != '') ) {
                if ( substr( $file, -8 ) == 'volt.php' ) {
                    $path = $dir . $file;
                    self::deleteFile( $path );
                }
            }
        }
    }

    /**
     * Delete file
     *
     * @param string $file File path
     * @param array $exclude_files Excluded files
     */
    public static function deleteFile( $file, $exclude_files = array() )
    {
        if ( isset( $exclude_files ) && !is_array( $exclude_files ) ){
                $exclude_files = array($exclude_files);
        }
        if ( file_exists( $file ) && is_file( $file ) && array_search( basename( $file ),
            $exclude_files ) === false ) {
            @chmod( $file, 0777 );
            unlink( $file );
        }
    }
    
    /*
     * To register session
     * @param string $sesssion_name Name of the session
     * @param mixed $data Data for the session
     */

    public static function registerSession( $di, $sesssion_name, $data )
    {
        $session = $di->get( "session" );
        $session->set( $sesssion_name, $data );
    }


}
