package App;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class HighscoresController implements Initializable {


    @FXML
    private AnchorPane highscores;

    @FXML
    private Label textarea;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        File file = new File("src/App/Resources/css/Highscores.txt");
        Scanner scanner = null;
        try { scanner = new Scanner(file); } catch (FileNotFoundException e) { e.printStackTrace(); }
        while (scanner.hasNextLine()){
            textarea.setText(textarea.getText() + scanner.nextLine() + "\n");
        }


    }


    @FXML
    public void back(javafx.event.ActionEvent actionEvent) throws IOException {

        AnchorPane Readme = FXMLLoader.load(getClass().getResource("fxml/Menu.fxml"));
        highscores.getChildren().setAll(Readme);
    }

}
