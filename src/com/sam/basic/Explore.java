package com.sam.basic;


import java.util.Set;
import java.util.TreeSet;

public class Explore {
    public static void main(String[] args) {
        System.out.println("This is the class path: "+System.getProperty("java.class.path"));
        Set<String> propNames = new TreeSet<String>(System.getProperties().stringPropertyNames());
        for(String propertyName : propNames)
        {
            System.out.println(propertyName+" is "+System.getProperty(propertyName));
        }
    }
}
