package ch.makery.address.model;



import java.util.Random;
import java.util.Scanner;

public class GamerIA extends Gamer {

	public int playCard(int indice)
    {
    	//L'IA tire une valeur aléatoirement
		int value;
		Random rand = new Random();
		value = rand.nextInt(this.getHandCards().size());
		
		//Puis joue...
		System.out.println(this.getHandCards().get(value));
    	this.getBoardCards().add(this.getHandCards().get(value));
    	this.getHandCards().remove(value);
    	//activate Power of the card???????
    
    	return indice;
    }
    
    public int actionCHoice()
    {
    	System.out.println("\nGamerIA Pick a new card...\n");
    	
    	this.drawCard(1);
    	this.printHand();
    	
    	System.out.print("\nGamerIA play : ");
    	
    	int value;
		Random rand = new Random();
		value = rand.nextInt(this.getHandCards().size());
		this.playCard(value);
		
		return 0;
    		
    }
    
    public int cardCHoice()
    {
    	int value;
		Random rand = new Random();
		value = rand.nextInt(this.getHandCards().size());
    	
    	return value;
    }
}

