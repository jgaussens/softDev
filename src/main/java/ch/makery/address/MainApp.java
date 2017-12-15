package ch.makery.address;


import java.io.IOException;

import ch.makery.address.model.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class MainApp extends Application {
	
	 private Stage primaryStage;
	 private BorderPane rootLayout;
	 
	 private ObservableList<Deck> Main1 = FXCollections.observableArrayList();
	 
	 Board myBoard = new Board();
	 
	 Gamer gamer1 = new Gamer();
     Gamer gamer2 = new Gamer();
     
     
	 
	 public MainApp() {
	        // Add some sample data
	      //  Board.add(new Person("Hans", "Muster"));
	        
	        gamer1.setBoard(myBoard);
	    }

	@Override
	public void start(Stage primaryStage) {
		
		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AddressApp");

        initRootLayout();

        showGameBoard();		
	}
	
	/**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Shows the person overview inside the root layout.
     */
    public void showGameBoard() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/GameBoard.fxml"));
            AnchorPane GameBoard = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(GameBoard);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}