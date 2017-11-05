package main.java;

public class Troll extends Card {

    public static final String NAME = "Troll";

    public void power()
    {
        System.out.println("Swap the cards in front of you with the cards in front of your opponent");
        					//does it swap if we have more cards than the other / vice versa?
    }

    public String toString()
    {
        return Troll.NAME;
    }
}
