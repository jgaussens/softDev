import java.util.List;
import java.util.ArrayList;

public class Board {

	
	private List<Card> draw; //pioche
	private List<Gamer> gamers; //set of players
	
	
	public List<Card> getDraw()
	{
		return this.draw;
	}
	
	public Board()
	{
		this.draw = new ArrayList<Card>();
	}
	
	
}