package ch.makery.address.model;


import java.util.ArrayList;

public class Troll extends Card {

    public static final String NAME = "Troll";

    // swap the board cards of the opponent
    public void power(Gamer gamer1, Gamer gamer2){
    	if(gamer1.getBoardCards().size()!=0 && gamer2.getBoardCards().size()!=0)
    	{
    		ArrayList<Card> tmpList = new ArrayList<Card>(gamer1.getBoardCards());
            gamer1.getBoardCards().clear();
            gamer1.getBoardCards().addAll(gamer2.getBoardCards());
            gamer2.getBoardCards().clear();
            gamer2.getBoardCards().addAll(tmpList);
    	}
     }

    public String toString()
    {
        return Troll.NAME;
    }

    @Override
    public boolean equals(Object c){
        if(c instanceof Object ){
            return true;

        }
        return false;
    }
}
