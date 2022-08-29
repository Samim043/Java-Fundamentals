package com.sam.intermediate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        System.out.println("Enter a ZipCode : ");
       Scanner sc = new Scanner(System.in);
       String zipCode = sc.nextLine();
       if(zipCode.matches("^\\d{5}(-\\d{4})?$")){
           System.out.println(zipCode+" is a valid zipCode.");
       } else {
           System.out.println(zipCode+" is not a valid zipCode.");
       }
       String skills  = "JavaScript, HTML, CSS and  Java";
       for(String skill : skills.split("\\W+(and\\W+)?"))
        {
            System.out.printf("Skill : %s \n",skill);
        }
        String script ="I am a full stack developer. I am now training";
        Pattern pt = Pattern.compile("(\\w*(ul|ni|lo)\\w*)");
        Matcher mt = pt.matcher(script);
        while(mt.find())
        {
            System.out.printf("%s is shushy word because of %s.\n",mt.group(1),mt.group(2));
        }

    }
}
