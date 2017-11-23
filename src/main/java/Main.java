//package main.java;

public class Main {

    public static void main(String[] args) {

    	
    	//Initialisations
    	
    	//Board
        Board myBoard = new Board();
    	
        //Some Cards (1)
    	Korrigan korrigan1 = new Korrigan();
        Elf elf1 = new Elf();
        Gnome gnome1 = new Gnome();
        
        //Some Cards (2)
        Dryad dryad1 = new Dryad();
        Goblin goblin1 = new Goblin();
        Troll troll1 = new Troll();
        
        //Some card(3)
        Troll troll2 = new Troll();
        Goblin goblin2 = new Goblin();
        Elf elf2 = new Elf();
        Korrigan korrigan2 = new Korrigan();

        
        
        Gamer gamer1 = new Gamer();
        Gamer gamer2 = new Gamer();

        
        gamer1.setBoard(myBoard);
        gamer2.setBoard(myBoard); //ça sert à quoi déjà setBoard?  => Camille ?????? Ils partagent tous les deux le même board c'est ça?

        //Add Some cards to the draw(1)
        myBoard.getDraw().add(korrigan1);
        myBoard.getDraw().add(elf1);
        myBoard.getDraw().add(gnome1);
        
        //Add Some cards to the draw(2)
        myBoard.getDraw().add(dryad1);
        myBoard.getDraw().add(goblin1);
        myBoard.getDraw().add(troll1);
        
        //Add Some cards to the draw(2)
        myBoard.getDraw().add(troll2);
        myBoard.getDraw().add(goblin2);
        myBoard.getDraw().add(elf2);
        myBoard.getDraw().add(korrigan2);



        System.out.print("Original Deck:");
        System.out.println(myBoard.getDraw());
        
        
        //Shuffling the Draw
        
        
        //Player 1 Draws 3 Cards and plays 1 (number 1(0))
        System.out.println("Player 1 draws 3 cards");
        gamer1.drawCard(3);
        System.out.println("Gamer1 hand cards" + gamer1.getHandCards());
        System.out.println("What is left in the deck" +myBoard.getDraw());
        
        
      //Player 2 Draws 3 Cards and plays 1 (number 1(0))
        System.out.println("Player 2 draws 3 cards");
        gamer2.drawCard(3);
        System.out.println("Gamer2 hand cards" + gamer2.getHandCards());
        System.out.println("What is left in the deck" +myBoard.getDraw());
               

        
        //Gamer 1 plays 1 Card
        System.out.print("Playing a card from a certain indice ");
        gamer1.playCard(1);
        System.out.println("Gamer1 hand cards after playing a card" + gamer1.getHandCards());
        System.out.println("Board of the gamer1" + gamer1.getBoardCards());


      //Gamer 2 plays 1 Card
        System.out.print("Playing a card from a certain indice ");
        gamer2.playCard(1);
        System.out.println("Gamer2 hand cards after playing a card" + gamer2.getHandCards());
        System.out.println("Board of the gamer2" + gamer2.getBoardCards());
        
        
        System.out.println("\n");
        System.out.println("Testing Cards power independently");
        
        //Test Gnome:
        System.out.println("Gamer1 hand cards Before Gnome Effect" + gamer1.getHandCards());
        System.out.println("TestGnome activating power for Gamer1");
        gnome1.power(gamer1);
        System.out.println("Gamer1 hand cards after gnome effect" + gamer1.getHandCards());

        
        
        //Test Goblin
        System.out.println("\n");
        System.out.println("Gamer1 hand cards Before Goblin Effect" + gamer1.getHandCards());
        System.out.println("Gamer2 hand cards Before Goblin Effect" + gamer2.getHandCards());
        System.out.println("TestGoblin activating power for gamer 1 and 2");
        goblin1.power(gamer1,gamer2);
        System.out.println("Gamer1 hand cards after gnome effect" + gamer1.getHandCards());
        System.out.println("Gamer2 hand cards after gnome effect" + gamer2.getHandCards());
        
        
      //Test Troll
        System.out.println("\n");
        System.out.println("Gamer1 board cards Before Troll Effect" + gamer1.getBoardCards());
        System.out.println("Gamer2 board cards Before Troll Effect" + gamer2.getBoardCards());
        System.out.println("TestGoblin activating power for gamer 1 and 2");
        troll1.power(gamer1,gamer2);
        System.out.println("Gamer1 board cards after Troll effect" + gamer1.getBoardCards());
        System.out.println("Gamer2 board cards after Troll effect" + gamer2.getBoardCards());

        
        //System.out.print("Deck after shuffle:");
        //System.out.println(myDeck.getCards());
        
        //System.out.println(myBoard.getDraw().subList(myBoard.getDraw().size()-2, myBoard.getDraw().size()));
    }
}