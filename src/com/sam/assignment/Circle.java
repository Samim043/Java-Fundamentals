package com.sam.assignment;

public class Circle implements GeometricObject{
    protected double radius =1.0;
    Circle(double radius)
    {
        this.radius = radius;
    }
    public double getPerimeter()
    {
        return radius;
    }
    public double getArea()
    {
         return 3.1416*(radius*radius);
    }
}
