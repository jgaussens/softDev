package ch.makery.address.model;

public abstract class Card {

    /**
     * @Var String, name of the card's race
     */
    private String race;

    /**
     * @Returns power of the card
     */
    //public abstract void power();

    public abstract String toString();

    public abstract void power(Gamer gamer1, Gamer gamer2);

    @Override
    public boolean equals(Object c){
        if(c instanceof Object){
            Card card=(Card) c;
            card.race=this.race;
            return true;
        }
        return false;
    }
}
