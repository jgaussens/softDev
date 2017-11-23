import java.util.ArrayList;

//package main.java;

public class Goblin extends Card {

    public static final String NAME = "Goblin";
    
    
    //swap the hand of the 2 players
    public void power(Gamer gamer1, Gamer gamer2){
        ArrayList<Card> tmpList = new ArrayList<Card>(gamer1.getHandCards());
        gamer1.getHandCards().clear();
        gamer1.getHandCards().addAll(gamer2.getHandCards());
        gamer2.getHandCards().clear();
        gamer2.getHandCards().addAll(tmpList);
     }


    public String toString()
    {
        return Goblin.NAME;
    }
}
