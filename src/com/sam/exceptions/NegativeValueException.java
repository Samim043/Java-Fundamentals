package com.sam.exceptions;

public class NegativeValueException extends Exception {

    NegativeValueException()
    {
        super("Values should be greater than Zero");
    }

}
