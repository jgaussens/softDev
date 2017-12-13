package main.java;

import java.util.List;
import java.util.ArrayList;

public class Gamer {

    private List<Card> handCards;
    private List<Card> boardCards;



    private Board board;

    public Gamer()
    {
    	this.handCards = new ArrayList<Card>();
    	this.boardCards = new ArrayList<Card>();
    }
    
    
    public List<Card> getHandCards()
    {
    	return this.handCards;
    }
    
    public List<Card> getBoardCards()
    {
    	return this.boardCards;
    }
    
    public void setBoard(Board board)
    {
    	this.board = board;
    }

    public Board getBoard() {
        return board;
    }
    
    
    public void playCard(int indice)
    {

    //handcards vers boardCards
    	System.out.println(this.handCards.get(indice));
    	this.boardCards.add(this.handCards.get(indice));
    	this.handCards.remove(indice);
    	//activate Power of the card???????
    
    }
    
    public void drawCard(int n)
    {
    	//System.out.println(this.board.getDraw().subList(2,3));
    	this.handCards.addAll(this.board.getDraw().subList(this.board.getDraw().size()-n, this.board.getDraw().size()));
    	// Removing from the deck the card we just drew
    	for (int i = n; i > 0; i--)
        {
    		this.board.getDraw().remove(this.board.getDraw().size() - i);
        }
    	//System.out.println(this.board.getDraw().subList(this.board.getDraw().size()-n, this.board.getDraw().size()));
    }
     @Override
    public  boolean equals(Object c){
        if (c instanceof  Object){
            Gamer g=(Gamer) c;
            g.board=this.board;
            g.boardCards=this.boardCards;
            g.handCards=this.handCards;
            return true;
        }
        return false;
     }
    
    
}
