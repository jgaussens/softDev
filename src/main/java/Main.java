package main.java;


//To do last
// Simulation des tours / fin du jeu
// Fin du jeu quand: deck empty + premier jour à jouer sa dernière carte. Then joueur adverse joue 1 carte et terminé
// 1 tour = Joueur pioche 1 carte, joue 1 carte, active pouvoir de la carte jouée (ou active autant de pouvoirs que voulu????? métonnerait?
//à la fin: +1 point pour chaque perso sur son royaume. +3 extra points si joueur a "presque" 1 individu de chaque race (cad???? pas clair).

public class Main {

    public static void main(String[] args) {
        
        Partie partie = new Partie();
        partie.init();
        partie.roundOfGame();
        
        /*
        
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
        gnome1.power(gamer1, gamer2);
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

        System.out.println(myBoard.getDraw().subList(myBoard.getDraw().size()-2, myBoard.getDraw().size()));
        System.out.println(gamer1.getHandCards().get(1));

        // Test Elf power
        System.out.println(gamer2.getBoardCards());
        System.out.println(gamer2.getHandCards());
        gamer2.playCard(0);
        gamer2.getBoardCards().get(0).power(gamer2, gamer1);
        System.out.println(gamer2.getBoardCards());
        gamer2.getBoardCards().get(0).power(gamer2, gamer1);

        // Test Korrigan power
        System.out.println(gamer1.getHandCards());
        gamer1.playCard(0);
        System.out.println(gamer1.getBoardCards());
        System.out.println("Before Korrigan's power :");
        System.out.println("Gamer 1 hand : " + gamer1.getHandCards());
        System.out.println("Gamer 2 hand : " + gamer2.getHandCards());
        gamer1.getBoardCards().get(1).power(gamer1, gamer2); // Activates power of the korrigan card
        System.out.println("After Korrigan's power :");
        System.out.println("Gamer 1 hand : " + gamer1.getHandCards());
        System.out.println("Gamer 2 hand : " + gamer2.getHandCards());

        // Test Dryad power
        gamer1.playCard(1);
        System.out.println("Before Dryad's power :");
        System.out.println(gamer1.getBoardCards());
        System.out.println(gamer2.getBoardCards());
        gamer1.getBoardCards().get(2).power(gamer1, gamer2);
        System.out.println("After Dryad's power :");
        System.out.println(gamer1.getBoardCards());
        System.out.println(gamer2.getBoardCards());
        
        */
    }
}