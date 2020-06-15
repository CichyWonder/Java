package App;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {

    @FXML
    private AnchorPane menu;


    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void exit(){
        System.exit(0);
    }

    public void readme(javafx.event.ActionEvent actionEvent) throws IOException {

        AnchorPane Readme = FXMLLoader.load(getClass().getResource("fxml/ReadMe.fxml"));
        menu.getChildren().setAll(Readme);
    }


    public void start(javafx.event.ActionEvent actionEvent){

            Stage menu = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Game snake= new Game();
            snake.start(menu);


    }

    public void highscores(ActionEvent actionEvent) throws IOException{
        AnchorPane highscores = FXMLLoader.load(getClass().getResource("fxml/Highscores.fxml"));
        menu.getChildren().setAll(highscores);
    }

    public void sterowanie(ActionEvent actionEvent) throws IOException {

        AnchorPane sterowanie = FXMLLoader.load(getClass().getResource("fxml/Sterowanie.fxml"));
        menu.getChildren().setAll(sterowanie);
    }
}
