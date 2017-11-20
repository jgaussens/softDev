//package main.java;

public class Main {

    public static void main(String[] args) {

        Korrigan korrigan1 = new Korrigan();
        Elf elf1 = new Elf();
        Gnome gnome1 = new Gnome();

        Board myBoard = new Board();
        
        Deck myDeck = new Deck();
        Gamer gamer1 = new Gamer();
        gamer1.setBoard(myBoard);

        myBoard.getDraw().add(korrigan1);
        myBoard.getDraw().add(elf1);
        myBoard.getDraw().add(gnome1);

        System.out.print("Original Deck:");
        System.out.println(myBoard.getDraw());
        
        //myBoard.getDraw().shuffle();
        
        //myDeck.shuffleDeck();
        
        gamer1.drawCard(2);
        System.out.println("Gamer hand cards" + gamer1.getHandCards());
        //gamer1.getHandCards().remove(gamer1.getHandCards().size() - 1);
        //System.out.println("Gamer hand cards" + gamer1.getHandCards());
        System.out.println("What is left in the deck" +myBoard.getDraw());

        
        //System.out.print("Deck after shuffle:");
        //System.out.println(myDeck.getCards());
        
        //System.out.println(myBoard.getDraw().subList(myBoard.getDraw().size()-2, myBoard.getDraw().size()));
    }
}