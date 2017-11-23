import java.util.ArrayList;

//package main.java;

public class Troll extends Card {

    public static final String NAME = "Troll";

    public void power(Gamer gamer1, Gamer gamer2){
        ArrayList<Card> tmpList = new ArrayList<Card>(gamer1.getBoardCards());
        gamer1.getBoardCards().clear();
        gamer1.getBoardCards().addAll(gamer2.getBoardCards());
        gamer2.getBoardCards().clear();
        gamer2.getBoardCards().addAll(tmpList);
     }

    public String toString()
    {
        return Troll.NAME;
    }
}
