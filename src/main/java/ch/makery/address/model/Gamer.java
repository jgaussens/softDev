package ch.makery.address.model;


import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Gamer {

    private String name;
    private int score;
	private List<Card> handCards;
    private List<Card> boardCards;
    


    private Board board;

    public Gamer()
    {
    	this.name = "";
    	this.handCards = new ArrayList<Card>();
    	this.boardCards = new ArrayList<Card>();//Kingdom
    }
    
    public Gamer(String name)
    {
    	this.name = name;
    	this.handCards = new ArrayList<Card>();
    	this.boardCards = new ArrayList<Card>();
    }
    
    public String getName()
    {
    	return this.name;
    }
    
    public String setName(String name)
    {
    	return this.name = name;
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
    
    public int playCard(int indice)
    {

    	//handcards vers boardCards
    	System.out.println("(PlayCard)");
    	System.out.println(this.handCards.get(indice));
    	this.boardCards.add(this.handCards.get(indice));
    	this.handCards.remove(indice);
    	//activate Power of the card???????
    	
    	return indice;
    }
    
    public void drawCard(int n)
    {
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
    	System.out.println("\nYour hand:\n");
    	for(int i=0; i<this.getHandCards().size(); i++)
    	{
    		System.out.println((i+1) + ". - " + this.getHandCards().get(i));
    	}
    }
    
    public int actionCHoice()
    {
    	
    	System.out.println("1. Pick a card - 2. Play a card");
        int choice;
        Scanner scanner = new Scanner(System.in); 
        choice = scanner.nextInt();
        	
    	while(choice != 1 && choice != 2)
    	{
    		System.out.println("Please make another choice !");
    		System.out.println("1. Pick a card - 2. Play a card");
        	choice = scanner.nextInt();
    	}
    	
    	return choice;
    }
    
    public int cardCHoice()
    {
        int choice;
        Scanner scanner = new Scanner(System.in); 
        choice = scanner.nextInt();
        choice--;
    	while(choice < 0 && choice >= this.getHandCards().size() )
    	{
    		System.out.println("Please make another choice !");
    		this.printHand();
        	choice = scanner.nextInt();
    	}
    	
    	return choice;
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

	public int getScore() {
		return this.boardCards.size();
	}

	public void setScore(int score) {
		this.score = score;
	}
    
    
}
