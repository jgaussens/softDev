package model;
import ch.makery.address.model.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class DryadTest {

    Elf elf = new Elf();
    Dryad dryad= new Dryad();

    @Test
    public void power() throws Exception {

        Gamer g1=new Gamer();
        Gamer g2= new Gamer();


        g2.getBoardCards().add(elf);
        int n1before=g1.getBoardCards().size();
        int n2before=g2.getBoardCards().size();

        dryad.power(g1,g2);


        int n1after=g1.getBoardCards().size();
        int n2after=g2.getBoardCards().size();

        assertEquals(n1after,n1before+1);
        assertEquals(n2after,n2before-1);

    }

}
