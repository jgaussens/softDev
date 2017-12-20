package model;
import ch.makery.address.model.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GnomeTest {

    Gnome gnome = new Gnome();
    Korrigan korrigan = new Korrigan();
    Elf elf= new Elf();

    @Test
    public void power() throws Exception {

        Gamer g1=new Gamer();
        Gamer g2=new Gamer();

        g1.getHandCards().add(korrigan);
        g1.getBoard().getDraw().add(elf);
        g1.getBoard().getDraw().add(gnome);



        int nbefore=g1.getHandCards().size();
        int dbefore=g1.getBoard().getDraw().size();

        gnome.power(g1,g2);

        int nafter=g1.getHandCards().size();
        int dafter=g1.getBoard().getDraw().size();


        assertEquals(nafter,nbefore+2);
        assertEquals(dafter,dbefore-2);
    }

}
