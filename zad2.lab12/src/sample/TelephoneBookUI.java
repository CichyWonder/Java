package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TelephoneBookUI extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Zad4.fxml"));
        GridPane gridPane = fxmlLoader.load();
        Scene scene = new Scene(gridPane);
        stage.setTitle("Zad4");
        stage.setScene(scene);
        stage.show();
    }
}