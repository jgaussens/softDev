package main.java;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    private List<Card> cards;

    public Deck()
    {
        this.cards = new ArrayList<Card>();
    }

    public void addCard(Card card)
    {
        this.cards.add(card);
    }

    public List<Card> getCards() {
        return cards;
    }
}
