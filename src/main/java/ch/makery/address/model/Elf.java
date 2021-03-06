package ch.makery.address.model;

import java.util.Random;

public class Elf extends Card {

    public static final String NAME = "Elf";

    private boolean firstTimeUse;

    private Card copiedCard;

    public Elf()
    {
        this.firstTimeUse = true;
    }
/*
    // takes the power of another card from by board cards
    public void power(Gamer gamer1, Gamer opponent)
    {
        if (firstTimeUse) {
            // takes the power of another card from by board cards
            System.out.println("First time you use Elf power. You chose one of your cards you want to copy the power.");
            try {
                this.copyCard(gamer1);
            } catch (Exception e) {
                System.out.println("erreur : " + e.getMessage());
            }

            this.firstTimeUse = false;
        } else {
            // use the copied power
            System.out.println("Your elf copies the power from the card " + this.copiedCard + ".");
            this.copiedCard.power(gamer1, opponent);
        }
    }
*/
    public void power(Gamer gamer,Gamer opponent)
    {
    	/*
        //@todo: dynamize it in FRONT. Get chosenCard from user's choice.
    	int value;
		Random rand = new Random();
		value = rand.nextInt(this.getHandCards().size());
        Card chosenCard = gamer2.getBoardCards().get(1);

        while (chosenCard.toString() == "Elf") {
            System.out.println("You cannot chose an elf. Chose another card.");
        }
        //@todo: User must not be able to chose an Elf.

        this.copiedCard = chosenCard;
        System.out.println("You chose to copy " + chosenCard.toString() + "'s power with your Elf.");
        */
    	System.out.println("Elf activates his power");
 
        if(gamer.getBoardCards().size()>0){
        	Random rand = new Random();
            int indexToCopy = rand.nextInt(gamer.getBoardCards().size());
        	copyCard(gamer,indexToCopy);
        }
        
    }

    private void copyCard(Gamer gamer, int value)
    {
        //@todo: dynamize it in FRONT. Get chosenCard from user's choice.
        Card chosenCard = gamer.getBoardCards().get(value);

        if(chosenCard.toString() == "Elf") {
            System.out.println("You cannot chose an elf. Chose another card.");
        }
        //@todo: User must not be able to chose an Elf.

        this.copiedCard = chosenCard;
        System.out.println("You chose to copy " + chosenCard.toString() + "'s power with your Elf.");
    }
    
    public String toString()
    {
        return Elf.NAME;
    }

    @Override
    public  boolean equals(Object c){
        if (c instanceof Object){
            Elf e=(Elf) c;
            e.copiedCard=this.copiedCard;
            e.firstTimeUse=((Elf) c).firstTimeUse;
            return true;
        }
        return false;
    }
}
