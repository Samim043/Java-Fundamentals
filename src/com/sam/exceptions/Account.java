package com.sam.exceptions;

public class Account {
    public void deposit(float t) throws Exception
    {
        if(t<0)
        {
            throw new NegativeValueException();
        }
    }
}
