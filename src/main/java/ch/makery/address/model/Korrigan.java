package ch.makery.address.model;


import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Korrigan extends Card {

    public static final String NAME = "Korrigan";

    public void power(Gamer gamer, Gamer opponent)
    {
        System.out.println("Korrigan's power. Draw 2 random cards within your opponent hand");
        
        int value;
		Random rand = new Random();
		
        // Draw two cards randomly
        for(int i = 0; i < 2; i++) {
        	if(opponent.getHandCards().size()!=0)//On vérifie que sa main n'est pas vide
        	{
        		value = rand.nextInt(opponent.getHandCards().size());
                gamer.getHandCards().add(opponent.getHandCards().get(value));
                opponent.getHandCards().remove(value);
        	}
        }
        
    }

    public String toString()
    {
        return Korrigan.NAME;
    }

    @Override
    public boolean equals(Object c){
        if(c instanceof Object ){
            return true;

        }
        return false;
    }
}
