package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

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

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
    
    public void shuffleDeck()
    {
    	Collections.shuffle(this.cards);
    }
    
    
    public Card test(){
    	
    	return this.cards.get(this.cards.size()-1);
    }
    
    public void pickCard(Gamer gamer, int nCards)
    {
    	
    	
    }

    @Override
    public  boolean equals(Object c){
        if (c instanceof Object){
            Deck d=(Deck) c;
            d.cards=this.cards;
            return true;
        }
        return false;
    }
    
    
//    
    
    
//    public void PickCard(player, nCards)
//    {
//    	//piocher nCards(5 si en début de jeu, 1 sinon) dans le deck central pour 
//    	// le mettre dans la main du player (1 ou 2).
//    	
//    	//if nombre cards dans le deck = 1, piocher puis annoncer "EndGame()" ?
//    	//
//    	
//    }
}
