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
