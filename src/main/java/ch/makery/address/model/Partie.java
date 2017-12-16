package ch.makery.address.model;


import java.util.Random;

public class Partie {

	public Board board;
	private Gamer gamer1;
	private Gamer gamer2;
	private int round;
	private boolean currentGamer;
	
	public Partie()
	{
		this.gamer1 = new Gamer();
		this.gamer2 = new Gamer();
		this.board = new Board();
	}
	
	public Partie(Gamer g1, Gamer g2, Board board)
	{
		this.gamer1 = g1;
		this.gamer2 = g2;
		this.board = board;
	}
	
	public void init(int taillePioche)
	{	
        this.gamer1.setName("Player 1");
        this.gamer2.setName("Gamer IA");
        
        gamer1.setBoard(board);
        gamer2.setBoard(board); //ça sert à quoi déjà setBoard?  => Camille ?????? Ils partagent tous les deux le même board c'est ça?
        
        int value;
        Random rand = new Random();
        for(int i=0; i<taillePioche; i++)
        {
        	value = rand.nextInt(6) + 1;
        	switch(value) {
        		case(1):
        			board.getDraw().add(new Dryad());
        			break;
        		case(2):
        			board.getDraw().add(new Elf());
        			break;
        		case(3):
        			board.getDraw().add(new Gnome());
        			break;
        		case(4):
        			board.getDraw().add(new Goblin());
        			break;
        		case(5):
        			board.getDraw().add(new Korrigan());
        			break;
        		case(6):
        			board.getDraw().add(new Troll());
        			break;
        		default: 
        			System.out.println("Mauvaise attribution deck !");
                	break;
        	}
        }
        
	}
	
	public int roundOfGame()
	{
		boolean end_of_game = false;
		this.currentGamer = true;
		
		System.out.println(board.getDraw());
		
		while(!end_of_game)
		{
			System.out.println("\n[Round "+round+" ]\n");
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
		
		return round;
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
