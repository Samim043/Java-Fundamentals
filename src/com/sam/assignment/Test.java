package com.sam.assignment;

public class Test {
    public static void main(String[] args) {

        Box b1 = new Box();
        b1.setWidth(5);
        b1.setHeight(6);
        b1.setDepth(7);

        double volume = b1.volume();
        System.out.println("The Volume of the box object is "+volume+" cubic meter.");

        double w = b1.getWidth();
        double h = b1.getHeight();
        double d = b1.getDepth();

        Box b2 = new Box(w,h,d);
        if(b2.equalsTo(b1))
        {
            System.out.println("b1 is equal to b2");
        }
        else
        {
            System.out.println("b1 is not equal to b2");
        }

        b2.setDim(7,8,9);
        String s = b2.toString();
        System.out.println(s);


    }
}
