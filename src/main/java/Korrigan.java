package main.java;

public class Korrigan extends Card {

    public static final String NAME = "Korrigan";

    public void power(Gamer gamer1, Gamer gamer2)
    {
        System.out.println("Draw 2 random cards within your opponent hand");
    }

    public String toString()
    {
        return Korrigan.NAME;
    }
}
