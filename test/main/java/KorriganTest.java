package model;
import ch.makery.address.model.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class KorriganTest {

    Korrigan korrigan=new Korrigan();
    Elf elf = new Elf();
    Gnome gnome = new Gnome();
    Goblin goblin = new Goblin();


    @Test
    public void power() throws Exception {

        Gamer g1=new Gamer();
        Gamer g2=new Gamer();

        g1.getHandCards().add(korrigan);
        g2.getHandCards().add(elf);
        g2.getHandCards().add(gnome);
        g2.getHandCards().add(goblin);

        int n1before=g1.getHandCards().size();
        int n2before=g2.getHandCards().size();

        korrigan.power(g1,g2);

        int n1after=g1.getHandCards().size();
        int n2after=g2.getHandCards().size();

        assertEquals(n1after,n1after+2);
        assertEquals(n2after,n2before-2);
    }

}
