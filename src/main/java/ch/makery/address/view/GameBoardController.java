package ch.makery.address.view;

import javafx.event.EventHandler;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import javafx.scene.layout.HBox;


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
import ch.makery.address.model.Partie;
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
    private Text cntGoblinH2;

    @FXML
    private Text cntTrollH2;

    @FXML
    private Text cntKorriganH2;

    @FXML
    private Text cntGnomeH2;

    @FXML
    private Text cntElfH2;

    @FXML
    private Text cntDryadH2;

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
    private Text cntGoblinK2;

    @FXML
    private Text cntTrollK2;

    @FXML
    private Text cntKorriganK2;

    @FXML
    private Text cntGnomeK2;

    @FXML
    private Text cntElfK2;

    @FXML
    private Text cntDryadK2;

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
    private Text cntGoblinK;

    @FXML
    private Text cntTrollK;

    @FXML
    private Text cntKorriganK;

    @FXML
    private Text cntGnomeK;

    @FXML
    private Text cntElfK;

    @FXML
    private Text cntDryadK;

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
    private Text cntGoblinH;

    @FXML
    private Text cntTrollH;

    @FXML
    private Text cntKorriganH;

    @FXML
    private Text cntGnomeH;

    @FXML
    private Text cntElfH;

    @FXML
    private Text cntDryadH;

    @FXML
    private ImageView idDeck;

    @FXML
    private Text idPlayerPoint;

    @FXML
    private Text idPlayer2Point;
    
    @FXML
    private Text turnPlayer1;
    
    @FXML
    private Text turnPlayer2;
     
	Partie partie = new Partie();
		
	int countPlayerPoint =0;
	int countPlayer2Point =0;
	
	int countdraw=0;
	
    public void initialize(URL location, ResourceBundle resources) {         	 
      
    	partie.init(30);  
    	
    	hand2.setDisable(true);
    	kingdome2.setDisable(true);
    	kingdom1.setDisable(true);

    }


public void piocher(MouseEvent event) {	
	
	if(countdraw == 0)
	{
    partie.getGamer1().drawCard(5);
    partie.getGamer2().drawCard(5);
    countdraw++;
    turnPlayer1.setText("It's your turn");
    
    idDeck.setDisable(true);
	}
	
	else if(countdraw== 1)
	{	
		hand2.setDisable(false);
		partie.getGamer2().drawCard(1);
		countdraw++;
		 idDeck.setDisable(true);
	}
	
	else if(countdraw== 2)
	{
		hand1.setDisable(false);
		partie.getGamer1().drawCard(1);
		countdraw--;
		 idDeck.setDisable(true);
	}
	
	
	RefreshGame();       	
 }

public void poserCarteRoyaume(MouseEvent event ) {
	
	 	ImageView imageViewCurrent = (ImageView) event.getSource(); 		 	
	 
	 	partie.getGamer1().playCard(FindRightCard(FindCard(imageViewCurrent), partie.getGamer1().getHandCards())) ;
	 
	 	RefreshGame();
	 	
	 	hand1.setDisable(true);	 	
	 	kingdom1.setDisable(false);	 	
	 	
    }


public void poserCarteRoyaume2(MouseEvent event ) {
	
 	ImageView imageViewCurrent = (ImageView) event.getSource(); 		 	
 	 	
 	partie.getGamer2().playCard(FindRightCard(FindCard(imageViewCurrent), partie.getGamer2().getHandCards())) ;
 
 	RefreshGame();	
	  		 
 	hand2.setDisable(true);
 	kingdome2.setDisable(false);
 	
}


public void usePower(MouseEvent event ) {
	
 	ImageView imageViewCurrent = (ImageView) event.getSource(); 
 	 	
 	 	 
 	partie.getGamer1().getBoardCards().get(FindRightCard(FindCard(imageViewCurrent),partie.getGamer1().getBoardCards())).power(partie.getGamer1(), partie.getGamer2());
 		 		 
 	
 	kingdom1.setDisable(true); 	
 	
 	 turnPlayer1.setText(null);
 	 turnPlayer2.setText("It's your turn");
 	 idDeck.setDisable(false);
 	
 	
 	RefreshGame();	
}

public void usePower2(MouseEvent event ) {
	
 	ImageView imageViewCurrent=(ImageView) event.getSource(); 
 	 	 
 	partie.getGamer2().getBoardCards().get(FindRightCard(FindCard(imageViewCurrent),partie.getGamer2().getBoardCards())).power(partie.getGamer2(), partie.getGamer1());
 		 		 
 	kingdome2.setDisable(true); 	
 	
 	 turnPlayer2.setText(null);
 	 turnPlayer1.setText("It's your turn");
 	idDeck.setDisable(false);
 	 
 	
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
	
	
	
	for(int i=0; i<partie.getGamer1().getHandCards().size(); i++)
	{
		cardImageView(partie.getGamer1().getHandCards().get(i)).setImage(createCardImg(partie.getGamer1().getHandCards().get(i)));
	}
	
	for(int i=0; i<partie.getGamer1().getBoardCards().size(); i++)
	{
		cardImageViewKingdom(partie.getGamer1().getBoardCards().get(i)).setImage(createCardImg(partie.getGamer1().getBoardCards().get(i)));
	}
	
	for(int i=0; i<partie.getGamer2().getHandCards().size(); i++)
	{
		cardImageView2(partie.getGamer2().getHandCards().get(i)).setImage(createCardImg(partie.getGamer2().getHandCards().get(i)));
	}
	
	for(int i=0; i<partie.getGamer2().getBoardCards().size(); i++)
	{
		cardImageViewKingdom2(partie.getGamer2().getBoardCards().get(i)).setImage(createCardImg(partie.getGamer2().getBoardCards().get(i)));
	}
	
	countPlayerPoint = partie.getGamer1().getBoardCards().size();
	 idPlayerPoint.setText(Integer.toString(countPlayerPoint));	
	
	countPlayer2Point = partie.getGamer2().getBoardCards().size();
	 idPlayer2Point.setText(Integer.toString(countPlayer2Point));
	 
	 cntTrollH.setText(CountCard("Troll", partie.getGamer1().getHandCards()));
	 cntGoblinH.setText(CountCard("Goblin", partie.getGamer1().getHandCards()));
	 cntElfH.setText(CountCard("Elf", partie.getGamer1().getHandCards()));
	 cntKorriganH.setText(CountCard("Korrigan", partie.getGamer1().getHandCards()));
	 cntDryadH.setText(CountCard("Dryad", partie.getGamer1().getHandCards()));
	 cntGnomeH.setText(CountCard("Gnome", partie.getGamer1().getHandCards()));
	 
	 cntTrollK.setText(CountCard("Troll", partie.getGamer1().getBoardCards()));
	 cntGoblinK.setText(CountCard("Goblin", partie.getGamer1().getBoardCards()));
	 cntElfK.setText(CountCard("Elf", partie.getGamer1().getBoardCards()));
	 cntKorriganK.setText(CountCard("Korrigan", partie.getGamer1().getBoardCards()));
	 cntDryadK.setText(CountCard("Dryad", partie.getGamer1().getBoardCards()));
	 cntGnomeK.setText(CountCard("Gnome", partie.getGamer1().getBoardCards()));
	 
	 cntTrollH2.setText(CountCard("Troll", partie.getGamer2().getHandCards()));
	 cntGoblinH2.setText(CountCard("Goblin", partie.getGamer2().getHandCards()));
	 cntElfH2.setText(CountCard("Elf", partie.getGamer2().getHandCards()));
	 cntKorriganH2.setText(CountCard("Korrigan", partie.getGamer2().getHandCards()));
	 cntDryadH2.setText(CountCard("Dryad", partie.getGamer2().getHandCards()));
	 cntGnomeH2.setText(CountCard("Gnome", partie.getGamer2().getHandCards()));
	 
	 cntTrollK2.setText(CountCard("Troll", partie.getGamer2().getBoardCards()));
	 cntGoblinK2.setText(CountCard("Goblin", partie.getGamer2().getBoardCards()));
	 cntElfK2.setText(CountCard("Elf", partie.getGamer2().getBoardCards()));
	 cntKorriganK2.setText(CountCard("Korrigan", partie.getGamer2().getBoardCards()));
	 cntDryadK2.setText(CountCard("Dryad", partie.getGamer2().getBoardCards()));
	 cntGnomeK2.setText(CountCard("Gnome", partie.getGamer2().getBoardCards()));
	 
	 
}

private String CountCard(String race, List<Card> myList){
	int count=0;	
	
	for(int i=0; i<myList.size(); i++)
	{ 
		System.out.println("+");
		if(race == myList.get(i).toString())
		{
			count++;			
		}		
	}
	
	if(count ==0) return "";
	
	else return Integer.toString(count);	
	
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

