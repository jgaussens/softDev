package main.java;

import java.util.ArrayList;

public class Dryad extends Card {

    public static final String NAME = "Dryad";

    //fonction à finir
    public void power(Gamer gamer1, Gamer gamer2){
        //Comment choper l'indice de cette carte (self ça existe pas en C#)
    	int i = 0;
    	while(gamer1.getHandCards().get(i).toString() != "Dryad") // faire un toString ici pour choper là où c'est une driade
    	{
    		i+=1;
    		
    	}
    	//Choper le pouvoir du même indice sur le board d'en face
    		// que faire si personne en face?
    		//doit-on override la fonction pouvoir ?
     }

    public String toString()
    {
        return Dryad.NAME;
    }
}
