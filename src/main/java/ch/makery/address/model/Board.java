package ch.makery.address.model;

import java.util.List;
import java.util.ArrayList;

public class Board {

	
	private List<Card> draw; //pioche
	//private List<Gamer> gamers; //set of players
	
	
	public Board()
	{
		this.draw = new ArrayList<Card>();
	}

	@Override
	public boolean equals(Object c){
		if(c instanceof Object){
			Board b=(Board) c;
			b.draw=this.draw;
			return true;
		}
		return false;
	}

	public void setDraw(List<Card> draw) {
		this.draw = draw;
	}
	
	public List<Card> getDraw()
	{
		return this.draw;
	}
	
}
