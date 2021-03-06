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
        Alert sort = new Alert(AlertType.INFORMATION);
        sort.setTitle("Sorted Card Output");
        sort.setHeaderText("Sorted Card Generate");
        sort.setResizable(true);
        sort.getDialogPane().setPrefSize(900,340);
        sort.setContentText(deck.toString());
        sort.showAndWait();


        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Shuffled Card Output");
        alert.setHeaderText("Shuffled Card Generate");
        alert.setResizable(true);
        alert.getDialogPane().setPrefSize(900,340);
        alert.setContentText(deck.toString());
        alert.showAndWait();
    }
}
