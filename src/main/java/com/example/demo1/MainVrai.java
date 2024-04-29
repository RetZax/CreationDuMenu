package com.example.demo1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.StageStyle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;



public class MainVrai extends Application{
        Stage window;
        BorderPane layout;


    public void start(Stage primaryStage) throws Exception {
    window = primaryStage;
    window.setTitle("Menu zelda");


        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);
        Label nameLabel = new Label("Votre pseudo : ");
        nameLabel.setStyle("-fx-text-fill: aliceblue ");
        GridPane.setConstraints(nameLabel,0,0);

        TextField nameInput = new TextField();
       //marches pas
        nameInput.setPromptText("pseudo"); // Définir le texte d'invite avant d'ajouter le champ de texte à la grille
        GridPane.setConstraints(nameInput,1,0); // Positionnez nameInput sur la même ligne que le label

        Button commencerButton = new Button("Commencer");
        GridPane.setConstraints(commencerButton,1,1); // Positionnez commencerButton sur la ligne suivante

        // Ajoutez les éléments à la grille
        grid.getChildren().addAll(nameLabel, nameInput, commencerButton);

    //cree un menu en haut a gauche
    Menu partie = new Menu("_Configuration de la Partie");
    Menu parametres = new Menu("_Paramètres");
    Menu aide = new Menu("_Aide");

    // le contenu du menu quand on le fait defiler

        Menu nvpartieMenu = new Menu("Nouvelle partie...");
        nvpartieMenu.setOnAction(e -> System.out.println("Creation d'une nouvelle partie..."));
        partie.getItems().add(nvpartieMenu);
        Menu sauvegarder = new Menu("Sauvegarder la partie...");
        sauvegarder.setOnAction(e -> System.out.println("Sauvegarder la partie..."));
        partie.getItems().add(sauvegarder);
    Menu ouvrir = new Menu("Ouvrir une partie...");
        ouvrir.setOnAction(e -> System.out.println("Ouvrir une partie..."));
        partie.getItems().add(ouvrir);

    partie.getItems().add(new SeparatorMenuItem());

        Menu quitter = new Menu("Quitter...");
        quitter.setOnAction(e -> System.out.println("Quitter la partie..."));
        partie.getItems().add(quitter);
        Menu configuration = new Menu("Configuration des touches...");
        configuration.setOnAction(e -> System.out.println("Configuration des touches..."));
        partie.getItems().add(configuration);



    parametres.getItems().add(new SeparatorMenuItem());
    parametres.getItems().add(new MenuItem("Qualité graphique..."));
    parametres.getItems().add(new MenuItem("Volume..."));
    parametres.getItems().add(new MenuItem("Luminosité..."));

    aide.getItems().add(new MenuItem("Nous contacter..."));
    aide.getItems().add(new SeparatorMenuItem());
    aide.getItems().add(new MenuItem("Dictionnaire du jeu..."));

        Menu adresse = new Menu("Notre adresse...");
        adresse.setOnAction(e -> System.out.println("T'aura pas l'adresse batard..."));
        adresse.setDisable(true);
        aide.getItems().add(adresse);


        //selectionner deselectionner // checkmenuItem
      CheckMenuItem showLines = new CheckMenuItem("show line numbers");
    showLines.setOnAction(e -> {
        if(showLines.isSelected())
            System.out.println("Programme va montrer le nombre de lignes");
        else
            System.out.println("Masquer le numéro de ligne");
    });
    aide.getItems().addAll(showLines);
    //creation de la barre du menu
    MenuBar menuBar = new MenuBar();

    menuBar.getMenus().addAll(partie, parametres, aide);

    layout = new BorderPane();
    layout.setTop(menuBar);

        // Création d'un conteneur BorderPane
        BorderPane root = new BorderPane();

        // Ajout du grid au centre du BorderPane
        root.setCenter(grid);

    // Ajout du layout en haut du BorderPane
        root.setTop(layout);
        Scene scene = new Scene(root, 400, 400);
        scene.getStylesheets().add("Viper.css");

        window.setScene(scene);
        window.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
