package com.sam.exceptions;

public class IllegalTriangleException extends Exception{

    IllegalTriangleException(){
        super("Sum of any two sides of a Triangle should be greater than the third side. ");
    }
}
