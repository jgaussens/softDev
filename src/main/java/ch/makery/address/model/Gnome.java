package ch.makery.address.model;


public class Gnome extends Card {

    public static final String NAME = "Gnome";

    public void power(Gamer gamer1, Gamer gamer2)
    {
        System.out.println("POWER: Draw 2 cards");
        /*
        gamer1.drawCard(2);
        */
    }

    public String toString()
    {
        return Gnome.NAME;
    }

    @Override
    public boolean equals(Object c){
        if(c instanceof Object ){
            return true;

        }
        return false;
    }
}
