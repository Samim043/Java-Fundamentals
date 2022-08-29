package com.sam.annotation;
@Doc(
        desc = "Utility Class for Doing several Mathematical Operations."
)
public class MathUtil {
    private static final double EPSILON = 0.0001;
    @Doc(
            desc = "A method that calculates Area of a given Triangle",
            params ={"Double values of 3 sides of a triangle."},
            returnVal = "Returns the double value(Area of the triangle)."
    )
    public static double triangleArea(double a, double b, double c)
    {
        return 0.0;
    }
    @Doc(
            desc = "A method that calculates distance between two given points.",
            params ={"A Point","Another Point"},
            returnVal = "Returns the double value(Distance)."
    )
    public static double distance(double a, double b){
        return 0.0;
    }
    @Doc(
            desc = "A method that Calculates Epsilon."
    )
    public void epsilon(){

    }
}
