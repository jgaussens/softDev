package main.java;

public class Goblin extends Card {

    public static final String NAME = "Goblin";

    public void power()
    {
        System.out.println("Switch your hand with you opponent");
    }

    public String toString()
    {
        return Goblin.NAME;
    }
}
