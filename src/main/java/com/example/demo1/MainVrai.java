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
    Menu fileMenu = new Menu("Configuration de la Partie");
    Menu fileMenu2 = new Menu("Paramètres");
    Menu fileMenu3 = new Menu("Aide");

    // le contenu du menu quand on le fait defiler
    fileMenu.getItems().add(new MenuItem("Nouvelle partie... "));
    fileMenu.getItems().add(new MenuItem("Sauvegarder la partie... "));
    fileMenu.getItems().add(new MenuItem("Quitter la partie..."));


    fileMenu2.getItems().add(new MenuItem("Configuration des touches..."));
    fileMenu2.getItems().add(new MenuItem("Configuration de la qualité graphique..."));
    fileMenu2.getItems().add(new MenuItem("Ajustement du Volume..."));

    fileMenu3.getItems().add(new MenuItem("Nous contacter..."));
    fileMenu3.getItems().add(new MenuItem("Dictionnaire du jeu..."));


    //creation de la barre du menu
    MenuBar menuBar = new MenuBar();

    menuBar.getMenus().addAll(fileMenu, fileMenu2, fileMenu3);


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
