package main.java;

public class Main {

    public static void main(String[] args) {

        Korrigan korrigan1 = new Korrigan();
        Korrigan korrigan2 = new Korrigan();

        Deck myDeck = new Deck();

        myDeck.addCard(korrigan1);
        myDeck.addCard(korrigan2);

        System.out.print(myDeck.getCards());
    }
}