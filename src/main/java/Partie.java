package main.java;

import java.util.Scanner;

public class Partie {

	private Board board;
	private Gamer gamer1;
	private Gamer gamer2;
	private int round;
	private boolean currentGamer;
	
	public Partie(Gamer g1, Gamer g2, Board board)
	{
		this.gamer1 = g1;
		this.gamer2 = g2;
		this.board = board;
	}
	
	public void roundOfGame()
	{
		boolean end_of_game = false;
		this.currentGamer = true;
		
		System.out.println(board.getDraw());
		
		while(!end_of_game)
		{
			System.out.println("Round of game - "+round);
			if(currentGamer)
			{
				System.out.println("This the turn of the gamer 1...");
				gamer1.actionCHoice();
				currentGamer = !currentGamer;//On passe le tour au joueur suivant
			}
			else
			{
				System.out.println("This the turn of the gamer 2...");
				gamer2.actionCHoice();
				currentGamer = !currentGamer;
			}
			
			round++;
		}
	}
	
	public void init()
	{
		
	}
	
	 public void startGame()
	 {
	    	
	 }
	    
	    
	
	/***
	 * GETTER _ SETTER
	 * @return
	 */
	public Gamer getGamer1() {
		return gamer1;
	}
	public void setGamer1(Gamer gamer1) {
		this.gamer1 = gamer1;
	}
	public Gamer getGamer2() {
		return gamer2;
	}
	public void setGamer2(Gamer gamer2) {
		this.gamer2 = gamer2;
	}
	
	
}
