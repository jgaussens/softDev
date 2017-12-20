package model;

import ch.makery.address.model.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GamerTest {

    Korrigan korrigan = new Korrigan();
    Elf elf = new Elf();
    Gnome gnome=new Gnome();



    @Test
    public void playCard() throws Exception {
        Gamer g1=new Gamer();


        g1.getHandCards().add(korrigan);
        g1.getHandCards().add(elf);

        int nbefore=g1.getHandCards().size();
        int bbefore=g1.getBoardCards().size();

        g1.playCard(1);

        int nafter=g1.getHandCards().size();
        int bafter=g1.getBoardCards().size();

        assertEquals(nafter,nbefore-1);
        assertEquals(bafter,bbefore+1);
    }

    @Test
    public void drawCard() throws Exception {
        Gamer g1= new Gamer();

        g1.getHandCards().add(korrigan);
        g1.getBoard().getDraw().add(elf);
        g1.getBoard().getDraw().add(gnome);

        int nbefore=g1.getHandCards().size();
        int dbefore=g1.getBoard().getDraw().size();

        g1.drawCard(1);

        int nafter=g1.getHandCards().size();
        int dafter=g1.getBoard().getDraw().size();


        assertEquals(nafter,nbefore+1);
        assertEquals(dafter,dbefore-1);
    }

}
