package model;
import ch.makery.address.model.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GoblinTest {


    Elf elf= new Elf();
    Gnome gnome= new Gnome();
    Dryad dryad =new Dryad();

    Korrigan korrigan=new Korrigan();

    Goblin goblin =new Goblin();
    @Test
    public void power() throws Exception {
        Gamer g1= new Gamer();
        Gamer g2= new Gamer();
        Gamer g3=new Gamer();
        Gamer g4=new Gamer();

        g1.getHandCards().add(elf);
        g1.getHandCards().add(gnome);

        g2.getHandCards().add(dryad);
        g2.getHandCards().add(korrigan);

        goblin.power(g1,g2);

        g3.getHandCards().add(elf);
        g3.getHandCards().add(gnome);

        g4.getHandCards().add(dryad);
        g4.getHandCards().add(korrigan);

        assertEquals(g1.getHandCards(),g4.getHandCards());
        assertEquals(g2.getHandCards(),g3.getHandCards());







    }

}
