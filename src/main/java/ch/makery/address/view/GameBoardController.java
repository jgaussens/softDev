package ch.makery.address.view;

import javafx.animation.PauseTransition;
import javafx.event.EventHandler;
import javafx.fxml.FXML;

import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javafx.fxml.Initializable;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import ch.makery.address.model.Board;
import ch.makery.address.model.Card;
import ch.makery.address.model.Dryad;
import ch.makery.address.model.Elf;
import ch.makery.address.model.Gamer;
import ch.makery.address.model.Gnome;
import ch.makery.address.model.Goblin;
import ch.makery.address.model.Korrigan;
import ch.makery.address.model.Troll;


public class GameBoardController implements Initializable{
	
	
	@FXML
    private HBox hand2;

    @FXML
    private ImageView idGoblinHand2;

    @FXML
    private ImageView idTrollHand2;

    @FXML
    private ImageView idKorriganHand2;

    @FXML
    private ImageView idGnomeHand2;

    @FXML
    private ImageView idElfHand2;

    @FXML
    private ImageView idDryadHand2;

    @FXML
    private HBox kingdome2;

    @FXML
    private ImageView idGoblinKingdom2;

    @FXML
    private ImageView idTrollKingdom2;

    @FXML
    private ImageView idKorriganKingdom2;

    @FXML
    private ImageView idGnomeKingdom2;

    @FXML
    private ImageView idElfKingdom2;

    @FXML
    private ImageView idDryadKingdom2;

    @FXML
    private HBox kingdom1;

    @FXML
    private ImageView idGoblinKingdom;

    @FXML
    private ImageView idTrollKingdom;

    @FXML
    private ImageView idKorriganKingdom;

    @FXML
    private ImageView idGnomeKingdom;

    @FXML
    private ImageView idElfKingdom;

    @FXML
    private ImageView idDryadKingdom;

    @FXML
    private HBox hand1;

    @FXML
    private ImageView idGoblinHand;

    @FXML
    private ImageView idTrollHand;

    @FXML
    private ImageView idKorriganHand;

    @FXML
    private ImageView idGnomeHand;

    @FXML
    private ImageView idElfHand;

    @FXML
    private ImageView idDryadHand;

    @FXML
    private ImageView idDeck;
    
    @FXML
    private Text idPlayerPoint;
    
    @FXML
    private Text idPlayer2Point;
    
    Dryad dryad1 = new Dryad();
    Korrigan korrigan1 = new Korrigan();
    Elf elf1 = new Elf();
    Gnome gnome1 = new Gnome();
    Troll troll1 = new Troll();
    Goblin goblin1 = new Goblin();
    
    Board myBoard = new Board();
	Gamer gamer1 = new Gamer();
	Gamer gamer2 = new Gamer();
		
	int countPlayerPoint =0;
	int countPlayer2Point =0;
	
    public void initialize(URL location, ResourceBundle resources) {         	 
      
          gamer1.setBoard(myBoard); 
          gamer2.setBoard(myBoard); 
          
          myBoard.getDraw().add(korrigan1);
          myBoard.getDraw().add(elf1);
          myBoard.getDraw().add(gnome1);
          
          //Add Some cards to the draw(2)
         // myBoard.getDraw().add(dryad1);
          myBoard.getDraw().add(goblin1);
          myBoard.getDraw().add(troll1);         

    }


public void piocher(MouseEvent event) {	
	
	/*p.arm();
	PauseTransition pause = new PauseTransition(Duration.seconds(0.5));
	pause.setOnFinished(e -> piocher.disarm());
	pause.play();*/
    
	myBoard.getDraw().add(korrigan1);
    myBoard.getDraw().add(elf1);
    myBoard.getDraw().add(gnome1);
    
    //Add Some cards to the draw(2)
    myBoard.getDraw().add(dryad1);
    myBoard.getDraw().add(goblin1);
    myBoard.getDraw().add(troll1);
    
    gamer1.drawCard(4);
	gamer2.drawCard(4);
	
	System.out.print("Original Deck:");
    System.out.println(gamer1.getHandCards());
    System.out.println(myBoard.getDraw().size());             
	
    System.out.println(gamer2.getHandCards());
	
	RefreshGame();
          	        	
 }

public void poserCarteRoyaume(MouseEvent event ) {
	
	 	ImageView imageViewCurrent = (ImageView) event.getSource(); 		 	
	 
	 	gamer1.playCard(FindRightCard(FindCard(imageViewCurrent), gamer1.getHandCards())) ;
	 
	 	RefreshGame();	
 
    }



public void poserCarteRoyaume2(MouseEvent event ) {
	
 	ImageView imageViewCurrent = (ImageView) event.getSource(); 		 	
 	
 	
 	gamer2.playCard(FindRightCard(FindCard(imageViewCurrent), gamer2.getHandCards())) ;
 
 	RefreshGame();	
	  		 
	 
}

public void usePower(MouseEvent event ) {
	
 	ImageView imageViewCurrent = (ImageView) event.getSource(); 
 	
 	 
 	gamer1.getBoardCards().get(FindRightCard(FindCard(imageViewCurrent),gamer1.getBoardCards())).power(gamer1, gamer2);
 	
	 		 
 	RefreshGame();	
}

public void usePower2(MouseEvent event ) {
	
 	ImageView imageViewCurrent = (ImageView) event.getSource(); 
 	
 	 
 	gamer2.getBoardCards().get(FindRightCard(FindCard(imageViewCurrent),gamer2.getBoardCards())).power(gamer2, gamer1);
 	
	 		 
 	RefreshGame();	
}
	
	
public void RefreshGame()
{
	idTrollHand.setImage(null);
	idGnomeHand.setImage(null);
	idElfHand.setImage(null);
	idGoblinHand.setImage(null);
	idDryadHand.setImage(null);
	idKorriganHand.setImage(null);
	
	idTrollHand2.setImage(null);
	idGnomeHand2.setImage(null);
	idElfHand2.setImage(null);
	idGoblinHand2.setImage(null);
	idDryadHand2.setImage(null);
	idKorriganHand2.setImage(null);
	
	idTrollKingdom.setImage(null);
	idGnomeKingdom.setImage(null);
	idElfKingdom.setImage(null);
	idGoblinKingdom.setImage(null);
	idDryadKingdom.setImage(null);
	idKorriganKingdom.setImage(null);
	
	idTrollKingdom2.setImage(null);
	idGnomeKingdom2.setImage(null);
	idElfKingdom2.setImage(null);
	idGoblinKingdom2.setImage(null);
	idDryadKingdom2.setImage(null);
	idKorriganKingdom2.setImage(null);
	
	for(int i=0; i<gamer1.getHandCards().size(); i++)
	{
		cardImageView(gamer1.getHandCards().get(i)).setImage(createCardImg(gamer1.getHandCards().get(i)));
	}
	
	for(int i=0; i<gamer1.getBoardCards().size(); i++)
	{
		cardImageViewKingdom(gamer1.getBoardCards().get(i)).setImage(createCardImg(gamer1.getBoardCards().get(i)));
	}
	
	for(int i=0; i<gamer2.getHandCards().size(); i++)
	{
		cardImageView2(gamer2.getHandCards().get(i)).setImage(createCardImg(gamer2.getHandCards().get(i)));
	}
	
	for(int i=0; i<gamer2.getBoardCards().size(); i++)
	{
		cardImageViewKingdom2(gamer2.getBoardCards().get(i)).setImage(createCardImg(gamer2.getBoardCards().get(i)));
	}
	
	countPlayerPoint = gamer1.getBoardCards().size();
	 idPlayerPoint.setText(Integer.toString(countPlayerPoint));	
	
	countPlayer2Point = gamer2.getBoardCards().size();
	 idPlayer2Point.setText(Integer.toString(countPlayer2Point));
	
}

private int FindRightCard(String race, List<Card> myList)
{
	int indice =-1;
	
	for(int i=0; i<myList.size(); i++)
	{
		if(race == myList.get(i).toString())
		{
			return i;
		}
	}
	
	
	return indice;
}

private String FindCard(ImageView cardi)
{
	String result ="";
	
		switch (cardi.getId()) {
		case "idKorriganHand":
		    result = "Korrigan"; 
		    break;
		case "idDryadHand":
		    result = "Dryad";
		    break;
		case "idElfHand":
		    result = "Elf";
		    break;
		case "idGoblinHand":
		    result = "Goblin";
		    break;
		case "idGnomeHand":
		    result = "Gnome";
		    break;
		case "idTrollHand":
		    result = "Troll";
		    break;
		    
		case "idKorriganHand2":
		    result = "Korrigan"; 
		    break;
		case "idDryadHand2":
		    result = "Dryad";
		    break;
		case "idElfHand2":
		    result = "Elf";
		    break;
		case "idGoblinHand2":
		    result = "Goblin";
		    break;
		case "idGnomeHand2":
		    result = "Gnome";
		    break;
		case "idTrollHand2":
		    result = "Troll";
		    break;
		    
		case "idKorriganKingdom":
		    result = "Korrigan"; 
		    break;
		case "idDryadKingdom":
		    result = "Dryad";
		    break;
		case "idElfKingdom":
		    result = "Elf";
		    break;
		case "idGoblinKingdom":
		    result = "Goblin";
		    break;
		    
		case "idGnomeKingdom":
		    result = "Gnome";
		    break;
		    
		case "idTrollKingdom":
		    result = "Troll";
		    break;
		    
		case "idKorriganKingdom2":
		    result = "Korrigan"; 
		    break;
		case "idDryadKingdom2":
		    result = "Dryad";
		    break;
		case "idElfKingdom2":
		    result = "Elf";
		    break;
		case "idGoblinKingdom2":
		    result = "Goblin";
		    break;
		    
		case "idGnomeKingdom2":
		    result = "Gnome";
		    break;
		    
		case "idTrollKingdom2":
		    result = "Troll";
		    break;
		    
		}
return result;	
}

private Image createCardImg(Card card) {
    String ressource = cardImageURL(card);
    return new Image(getClass().getResourceAsStream(ressource));
}

private String cardImageURL(Card card) {
    String result = "";
    
    switch (card.toString()) {
        case "Korrigan":
            result = "images/korrigan.png";
            break;
        case "Dryad":
            result = "images/dryad.png";
            break;
        case "Elf":
            result = "images/elf.png";
            break;
        case "Goblin":
            result = "images/goblin.png";
            break;
        case "Gnome":
            result = "images/gnome.png";
            break;
        case "Troll":
            result = "images/troll.png";
            break;

    }

    return result;
}

private ImageView cardImageView(Card card) {
    ImageView result = null;
    
    switch (card.toString()) {
        case "Korrigan":
            result = idKorriganHand;
            break;
        case "Dryad":
            result = idDryadHand;
            break;
        case "Elf":
            result = idElfHand;
            break;
        case "Goblin":
            result = idGoblinHand;
            break;
        case "Gnome":
            result = idGnomeHand;
            break;
        case "Troll":
            result = idTrollHand;
            break;

    }

    return result;
}

private ImageView cardImageView2(Card card) {
    ImageView result = null;
    
    switch (card.toString()) {
        case "Korrigan":
            result = idKorriganHand2;
            break;
        case "Dryad":
            result = idDryadHand2;
            break;
        case "Elf":
            result = idElfHand2;
            break;
        case "Goblin":
            result = idGoblinHand2;
            break;
        case "Gnome":
            result = idGnomeHand2;
            break;
        case "Troll":
            result = idTrollHand2;
            break;

    }

    return result;
}

private ImageView cardImageViewKingdom(Card card) {
    ImageView result = null;
    
    switch (card.toString()) {
        case "Korrigan":
            result = idKorriganKingdom;
            break;
        case "Dryad":
            result = idDryadKingdom;
            break;
        case "Elf":
            result = idElfKingdom;
            break;
        case "Goblin":
            result = idGoblinKingdom;
            break;
        case "Gnome":
            result = idGnomeKingdom;
            break;
        case "Troll":
            result = idTrollKingdom;
            break;

    }

    return result;
}

private ImageView cardImageViewKingdom2(Card card) {
    ImageView result = null;
    
    switch (card.toString()) {
        case "Korrigan":
            result = idKorriganKingdom2;
            break;
        case "Dryad":
            result = idDryadKingdom2;
            break;
        case "Elf":
            result = idElfKingdom2;
            break;
        case "Goblin":
            result = idGoblinKingdom2;
            break;
        case "Gnome":
            result = idGnomeKingdom2;
            break;
        case "Troll":
            result = idTrollKingdom2;
            break;

    }

    return result;
}
}

