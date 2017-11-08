//package main.java;

public class Dryad extends Card {

    public static final String NAME = "Dryad";

    public void power()
    {
        System.out.println("Steal a card in front of your opponent and add it in front of you without activating its power");
    }

    public String toString()
    {
        return Dryad.NAME;
    }
}
