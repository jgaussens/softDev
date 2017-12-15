package ch.makery.address.model;


import java.util.concurrent.ThreadLocalRandom;

public class Korrigan extends Card {

    public static final String NAME = "Korrigan";

    public void power(Gamer gamer, Gamer opponent)
    {
        System.out.println("Korrigan's power. Draw 2 random cards within your opponent hand");

        // Draw two cards randomly
        for(int i = 0; i < 2; i++) {
            int randomIndex = ThreadLocalRandom.current().nextInt(0, opponent.getHandCards().size());
            gamer.getHandCards().add(opponent.getHandCards().get(randomIndex));
            opponent.getHandCards().remove(randomIndex);
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
