package main.java;


import org.junit.Test;

import static org.junit.Assert.*;

public class GamerTest {

    Korrigan korrigan = new Korrigan();
    Elf elf = new Elf();
    Gnome gnome=new Gnome();



    @Test
    public void playCard() throws Exception {
        Gamer g1=new Gamer();
        Gamer g2=new Gamer();

        g1.getHandCards().add(korrigan);
        g1.getHandCards().add(elf);

        g2.getHandCards().add(korrigan);
        g2.getBoardCards().add(elf);

        g1.playCard(1);

        assertEquals(g1,g2);
    }

    @Test
    public void drawCard() throws Exception {
        Gamer g1= new Gamer();
        Gamer g2=new Gamer();

        g1.getHandCards().add(korrigan);
        g1.getBoard().getDraw().add(elf);
        g1.getBoard().getDraw().add(gnome);

        g2.getHandCards().add(korrigan);
        g2.getHandCards().add(elf);
        g2.getBoard().getDraw().add(gnome);

        g1.drawCard(1);

        assertEquals(g1,g2);
    }

}