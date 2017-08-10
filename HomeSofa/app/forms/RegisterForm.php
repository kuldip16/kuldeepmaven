<?php

namespace RTB\Core\ShopFrontOffice\Forms ;

use Phalcon\Forms\{
    Form,
    Element\Text as Text,
    Element\Password as Password,
    Element\Hidden as Hidden      
};


use Phalcon\Validation\Validator\{
    PresenceOf,
    Email
};

class RegisterForm extends Form
{

    public function initialize($entity = null, $options = null)
    {
        if (isset($options['edit'])) {
           $this->add(new Hidden("id"));
        }
        // Email
        $email = new Text('email');
        $email->setLabel('E-Mail');
        $email->setFilters('email');
        $email->addValidators(array(
            new PresenceOf(array(
                'message' => 'E-mail is required'
            )),
            new Email(array(
                'message' => 'E-mail is not valid'
            ))
        ));
        $this->add($email);

        // Password
        $password = new Password('password');
        $password->setLabel('Password');
        $password->addValidators(array(
            new PresenceOf(array(
                'message' => 'Password is required'
            ))
        ));
        $this->add($password);

        // Confirm Password
        $repeatPassword = new Password('repeatPassword');
        $repeatPassword->setLabel('Repeat Password');
        $repeatPassword->addValidators(array(
            new PresenceOf(array(
                'message' => 'Confirmation password is required'
            ))
        ));
        $this->add($repeatPassword);
    }
}