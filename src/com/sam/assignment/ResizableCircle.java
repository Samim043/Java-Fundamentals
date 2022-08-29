package com.sam.assignment;

public class ResizableCircle extends Circle implements Resizable{
    ResizableCircle(double radius)
    {
        super(radius);
    }
    public void resize(int percent)
    {
        System.out.println("The Circle is resized by "+percent+"%.");
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        double rad = circle.getPerimeter();
        System.out.println("The radius of the Circle is "+rad+".");
        double area = circle.getArea();
        System.out.println("The Area of the Circle is "+area+".");

        ResizableCircle recircle = new ResizableCircle(4.5);
        rad = recircle.getPerimeter();
        System.out.println("The radius of the  ResizableCircle is "+rad+".");
        area = recircle.getArea();
        System.out.println("The Area of the Resizable Circle is "+area+".");

        recircle.resize(20);
    }
}
