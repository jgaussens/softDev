package main.java;

import java.util.List;
import java.util.Scanner;
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
    
    public void playCard(int indice)
    {

    	//handcards vers boardCards
    	System.out.println("(PlayCard)");
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
    
    public void printHand()
    {
    	for(int i=0; i<this.getHandCards().size(); i++)
    	{
    		System.out.println((i+1) + ". - " + this.getHandCards().get(i));
    	}
    }
    
    public void actionCHoice()
    {
    	System.out.println("1. Pick a card - 2. Play a card");
    	int choice;
    	Scanner scanner = new Scanner(System.in); 
    	choice = scanner.nextInt();
    	if(choice == 1)
    	{
    		this.drawCard(1);
    		this.printHand();
    	}
    	else if(choice == 2)
    	{
    		this.printHand();
    		System.out.println("Which card would you choose ?");
    		scanner = new Scanner(System.in); 
        	choice = scanner.nextInt();
        	
        	if(choice >= 1 && choice <= this.getHandCards().size() )
        	{
        		this.playCard(choice-1);
        	}
    	}
    	else
    		System.out.println("Please make another choice !");
    		
    }
    
    
}
