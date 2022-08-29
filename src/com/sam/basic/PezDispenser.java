package com.sam.basic;

public class PezDispenser {
    public final static byte MAX_PEZ =12;
    private int pezCount;
    final private String characterName;

    public PezDispenser(String characterName)
    {
        this.characterName = characterName;
        pezCount = 0;
    }
    public void fill()
    {
        fill(MAX_PEZ);
    }
    public void fill(int pezAmount)
    {
        pezCount += pezAmount;
    }
    public boolean dispense()
    {
        boolean wasDispensed = false;
        if(!isEmpty())
        {
            pezCount--;
            wasDispensed=true;
        }
        return wasDispensed;
    }
    public boolean isEmpty()
    {
        return pezCount==0;
    }
    public String getCharacterName()
    {
        return characterName;
    }

}
