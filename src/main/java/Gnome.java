package main.java;

public class Gnome extends Card {

    public static final String NAME = "Gnome";

    public void power()
    {
        System.out.println("Draw 2 cards");
    }

    public String toString()
    {
        return Gnome.NAME;
    }
}
