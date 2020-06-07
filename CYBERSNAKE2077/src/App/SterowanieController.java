package App;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SterowanieController implements Initializable {


    private Control control = new Control();

    private String upcontrol;

    private String downcontrol;

    private String leftcontrol;

    private String rightcontrol;

    @FXML
    private AnchorPane sterowanie;

    @FXML
    private TextField keyup;

   @FXML
   private TextField keydown;

   @FXML
   private TextField keyright;

   @FXML
   private TextField keyleft;


    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }


    @FXML
    public void back(javafx.event.ActionEvent actionEvent) throws IOException {

        AnchorPane Sterownie = FXMLLoader.load(getClass().getResource("fxml/Menu.fxml"));
        sterowanie.getChildren().setAll(Sterownie);
    }

    public void save(ActionEvent actionEvent) {
        control.setUp(upcontrol, downcontrol, leftcontrol , rightcontrol);

    }

    public void up(KeyEvent keyEvent) {
        String onpressup = keyEvent.getText();
        onpressup = onpressup.toUpperCase();
        keyup.setText(onpressup);
        this.upcontrol = onpressup;
    }
    public void down(KeyEvent keyEvent) {
        String onpressdown = keyEvent.getText();
        onpressdown = onpressdown.toUpperCase();
        keydown.setText(onpressdown);
        this.downcontrol = onpressdown;
    }
    public void left(KeyEvent keyEvent) {
        String onpressleft = keyEvent.getText();
        onpressleft = onpressleft.toUpperCase();
        keyleft.setText(onpressleft);
        this.leftcontrol = onpressleft;
    }
    public void right(KeyEvent keyEvent) {
        String onpressright = keyEvent.getText();
        onpressright = onpressright.toUpperCase();
        keyright.setText(onpressright);
        this.rightcontrol = onpressright;
    }
}