package model;


import org.junit.Test;
import ch.makery.address.model.*;
import static org.junit.Assert.*;

public class DeckTest {

    //Some Cards (1)


    Elf elf = new Elf();
    Gnome gnome = new Gnome();





    @Test
    public void addCard() throws Exception {
        Deck deck1= new Deck();

        deck1.getCards().add(elf);
        int nbefore=deck1.getCards().size();

        deck1.addCard(gnome);

        int nafter=deck1.getCards().size();

        assertEquals(nafter,nbefore+1);
        //assertEquals(deck1.getCards().size()-1,gnome);


    }

    @Test
    public void shuffleDeck() throws Exception {
        Deck deck1=new Deck();
        Deck deck2=new Deck();

        deck1.getCards().add(elf);
        deck1.getCards().add(gnome);

        deck2.getCards().add(gnome);
        deck2.getCards().add(elf);

        deck1.shuffleDeck();

        assertEquals(deck1,deck2);

    }

    @Test
    public void pickCard() throws Exception {
    }

}

