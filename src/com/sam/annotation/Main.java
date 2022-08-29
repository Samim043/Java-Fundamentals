package com.sam.annotation;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        Cheese cheese = new Cheese();
        System.out.println(cheese);

        // Get a class Object
        Class <?> clazz = MathUtil.class;

        // Get all declared methods.
        Method[] methods = clazz.getDeclaredMethods();

        //Loop over methods
        for (Method m : methods)
        {
            System.out.println("Name: "+m.getName());
            System.out.println("Parameters: "+m.getParameterCount());
            System.out.println("Return Type: "+m.getReturnType());
            int mods = m.getModifiers();
            String modStr = Modifier.toString(mods);
            System.out.println("Modifier: "+modStr );
        }

        //TODO: Process the MathUtils class's annotations


    }
}
