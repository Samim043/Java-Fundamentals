package com.sam.exceptions;

import java.util.Scanner;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    Triangle(int sideA, int sideB, int sideC) throws Exception
    {
        if((sideA+sideB)<=sideC || (sideC+sideB)<=sideA || (sideA+sideC)<=sideB ){
            throw new IllegalTriangleException();
        }
      setSideA(sideA);
      setSideB(sideB);
      setSideC(sideC);
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Three sides of a Triangle:");
        int sideA = sc.nextInt();
        int sideB = sc.nextInt();
        int sideC = sc.nextInt();

        try{
            Triangle triangle = new Triangle(sideA,sideB,sideC);
            System.out.println("The Values are valid. We can make a Triangle Now.");
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
