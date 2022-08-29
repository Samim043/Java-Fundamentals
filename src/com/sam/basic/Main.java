package com.sam.basic;

public class Main {
    public static void main(String[] args) {
        System.out.println("We Are making new PezDispensers");
        System.out.printf("FUN FACT: There can be at most %d pez in a dispenser\n", PezDispenser.MAX_PEZ);
        PezDispenser dispenser = new PezDispenser("Masterchief");
        System.out.printf("A Dispenser is created named %s .\n", dispenser.getCharacterName());
        if (dispenser.isEmpty())
            System.out.println("Dispenser is Empty.");
        System.out.println("Filling the dispenser with delicious Pez...");
        dispenser.fill();
        if (!dispenser.isEmpty())
            System.out.println("Dispenser is full.");
        while (dispenser.dispense()) {
            System.out.println("Chomp!!");
        }
        if (dispenser.isEmpty())
            System.out.println("We ate all the delicious Pez");
        while (dispenser.dispense()) {
            System.out.println("Chomp!!");
        }
    }
}
