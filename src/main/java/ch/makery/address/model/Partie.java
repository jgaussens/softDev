package ch.makery.address.model;


import java.util.Random;

public class Partie {

	public Board board;
	private Gamer gamer1;
	private Gamer gamer2;
	private int[]round;
	
	public Partie()
	{
		this.gamer1 = new Gamer();
		this.gamer2 = new Gamer();
		this.board = new Board();
		this.round = new int[2];
		round[0] = 1;
		round[1] = 0;
	}
	
	public Partie(Gamer g1, Gamer g2, Board board, int[]round)
	{
		this.gamer1 = g1;
		this.gamer2 = g2;
		this.board = board;
		this.round = round;
	}
	
	public void init(int taillePioche)
	{	
        this.gamer1.setName("Player 1");
        this.gamer2.setName("Gamer IA");
        
        gamer1.setBoard(board);
        gamer2.setBoard(board); //�a sert � quoi d�j� setBoard?  => Camille ?????? Ils partagent tous les deux le m�me board c'est �a?
        
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
        
        this.round[0] = 1;
        this.round[1] = 0;
        
      
	}
	
	/*
	 * @variable: round[0] = Nombre de tour de jeu
	 * 			  round[1] = Action en cours...
	 * 						 Si = 0, doit piocher	
	 * 						 Si = 1, doit jouer une carte
	 */
	public int[] roundOfGame()
	{
		if(round[0]%2==1)
		{
			switch(round[1])
			{
			case(0):
				System.out.println("\n[Round "+round[0]+" ]\n");
				System.out.println("This the turn of the gamer 1...");
				gamer1.drawCard(1);
				gamer1.printHand();
				round[1]++;
				break;
			case(1):
				int index = gamer1.playCard(gamer1.cardCHoice());//Retourne l'indice de la carte jou�
				System.out.println("aie");
				gamer1.getBoardCards().get(index).power(gamer1, gamer2);//.power(gamer1, gamer2);//On applique les effets du sort sur les deux joueurs
				round[1]--;//On passe � l'action suivante
				round[0]++;//On passe au tour du joueur suivant - Round suivant
				break;
			}
		}
		else
		{
			switch(round[1])
			{
			case(0):
				System.out.println("\n[Round "+round[0]+" ]\n");
				System.out.println("This the turn of the gamer 2...");
				gamer2.drawCard(1);
				gamer2.printHand();
				round[1]++;
				break;
			case(1):
				int index = gamer2.playCard(gamer2.cardCHoice());//Retourne l'indice de la carte jou�
				gamer2.getBoardCards().get(index).power(gamer2, gamer1);//On applique les effets du sort sur les deux joueurs
				round[1]--;//On passe � l'action suivante
				round[0]++;//On passe au tour du joueur suivant - Round suivant
			}
		}
		
		return round;
	}
	    
	public boolean endOfGame()
	{
		if(this.board.getDraw().size()==0 && this.gamer1.getHandCards().size()==0 
										  && this.gamer2.getHandCards().size()==0 
										  && this.getRound()[1] == 0)
		{
			System.out.println("\n\n[ FIN DU JEU ]");
			return true;
		}
		else
			return false;
	}
	
	/***
	 * GETTER _ SETTER
	 * @return
	 */
	public Gamer getGamer1() {
		return gamer1;
	}
	
	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
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

	public int[] getRound() {
		return round;
	}

	public void setRound(int[] round) {
		this.round = round;
	}
	
	
}
