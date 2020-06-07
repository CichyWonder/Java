package App;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ReadMeController implements Initializable {

    @FXML
    private AnchorPane readme;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }


    @FXML
    public void back(javafx.event.ActionEvent actionEvent) throws IOException {

        AnchorPane Readme = FXMLLoader.load(getClass().getResource("fxml/Menu.fxml"));
        readme.getChildren().setAll(Readme);
    }

}
