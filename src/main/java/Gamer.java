//package main.java;
import java.util.List;
import java.util.ArrayList;

public class Gamer {

    private List<Card> handCards;
    private List<Card> boardCards;
    private Board board;

    public Gamer()
    {
    	this.handCards = new ArrayList<Card>();
    }
    
    
    public List<Card> getHandCards()
    {
    	return this.handCards;
    }
    
    public void setBoard(Board board)
    {
    	this.board = board;
    }
    
    public void drawCards(int numberOfCards)
    {
        //  this.handCard.add(board.deck.draw(5));
    }

    
    
    public void playCard(Card c)
    {

    }
    
    public void drawCard(int n)
    {
    	//System.out.println(this.board.getDraw().subList(2,3));
    	//this.handCards.addAll(this.board.getDraw().subList(this.board.getDraw().size()-n, this.board.getDraw().size()));
    	System.out.println(this.board.getDraw().subList(this.board.getDraw().size()-n, this.board.getDraw().size()));
    }
}
