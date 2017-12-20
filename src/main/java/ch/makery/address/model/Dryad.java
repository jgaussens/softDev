package ch.makery.address.model;

import java.util.Random;

public class Dryad extends Card {

    public static final String NAME = "Dryad";

    //fonction à finir
    public void power(Gamer gamer, Gamer opponent)
    {
       System.out.println("Dryad's power activated.");
      /*  //Comment choper l'indice de cette carte (self Ã§a existe pas en C#)
    	int i = 0;
    	while(gamer1.getHandCards().get(i).toString() != "Dryad") // faire un toString ici pour choper lÃ  oÃ¹ c'est une driade
    	{
    		i+=1;
    		
    	}
    	//Choper le pouvoir du mÃªme indice sur le board d'en face
    		// que faire si personne en face?
    		//doit-on override la fonction pouvoir ?
    */
       	
        //@todo: dynamize in FRONT, get the index of the card the user wants to steal
        //@done
        int value;
		Random rand = new Random();
		
        if(opponent.getBoardCards().size() !=0)
        {
        	value = rand.nextInt(opponent.getBoardCards().size());
            int indexToSteal = value;
            gamer.getBoardCards().add(opponent.getBoardCards().get(indexToSteal));
        	opponent.getBoardCards().remove(indexToSteal);
        }
        
     }

    public String toString()
    {
        return Dryad.NAME;
    }

    @Override
    public boolean equals(Object c){
        if(c instanceof Object ){
            return true;

        }
        return false;
    }
}
