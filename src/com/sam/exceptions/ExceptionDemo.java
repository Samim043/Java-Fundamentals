package com.sam.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {

    public static void show() throws Exception
    {
        Account acc = new Account();
        acc.deposit(-1);
    }
}
