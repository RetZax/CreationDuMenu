package com.example.demo1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
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
    //partie.getItems().add(new MenuItem("Quitter..."));

        Menu configuration = new Menu("Configuration des touches...");
        configuration.setOnAction(e -> System.out.println("Configuration des touches..."));
        partie.getItems().add(configuration);
    //parametres.getItems().add(new MenuItem("Configuration des touches..."));


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


    //creation de la barre du menu
    MenuBar menuBar = new MenuBar();

    menuBar.getMenus().addAll(partie, parametres, aide);


    layout = new BorderPane();
    layout.setTop(menuBar);

    Scene scene = new Scene(layout, 400, 300);
    window.setScene(scene);
    window.show();


    }
    public static void main(String[] args) {
        launch(args);
    }
}
