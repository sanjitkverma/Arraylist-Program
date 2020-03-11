package com.company;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.application.Application;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch();
    }
    public void start(Stage primaryStage) throws Exception {
        Deck deck= new Deck();
        deck.shuffle();

        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Shuffled Card Output");
        alert.setHeaderText("Sorted Card Generate");
        alert.setResizable(true);
        alert.getDialogPane().setPrefSize(750,340);
        alert.setContentText(deck.toString());
        alert.showAndWait();
    }
}
