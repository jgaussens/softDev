package main.java;

public abstract class Card {

    /**
     * @Var String, name of the card's race
     */
    private String race;

    /**
     * @Returns power of the card
     */
    //public abstract void power();

    public abstract String toString();

    public abstract void power(Gamer gamer1, Gamer gamer2);
}
