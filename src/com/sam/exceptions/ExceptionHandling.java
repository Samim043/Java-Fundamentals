package com.sam.exceptions;

import java.util.Scanner;

public class ExceptionHandling {
    private int age;

    ExceptionHandling(int age)
    {
        setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void validate(int age) throws Exception
    {
        if(age<20|| age >70) {
            throw  new ArithmeticException("Invalid!.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        ExceptionHandling obj = new ExceptionHandling(age);
        try{
           obj.validate(age);
            System.out.println("Valid!.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
