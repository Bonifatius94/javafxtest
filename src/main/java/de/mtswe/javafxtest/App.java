package de.mtswe.javafxtest;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// /**
//  * JavaFX App
//  */
// public class App extends Application {

//     @Override
//     public void start(Stage stage) {

//         var label = new Label("Hello, JavaFX!");
//         var scene = new Scene(new StackPane(label), 640, 480);
//         stage.setScene(scene);
//         stage.show();
//     }

//     public static void main(String[] args) {
//         launch();
//     }

// }

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 
 */
public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // load the main view
        final String mainViewUri = "main/MainView.fxml";
        FXMLLoader loader = new FXMLLoader(getClass().getResource(mainViewUri));
        VBox window = loader.load();

        // apply the main view to a scene
        // then load the scene into the main stage
        Scene scene = new Scene(window);
        primaryStage.setScene(scene);

        // set the window title
        primaryStage.setTitle("Hello World, JavaFX!");

        // set the window height / width
        window.setPrefWidth(1200);
        window.setPrefHeight(800);

        // finally, show the window
        primaryStage.show();
    }

}