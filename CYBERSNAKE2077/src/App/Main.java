package App;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.stage.Stage;

import java.io.File;


public class Main extends Application {



    @Override
    public void start(Stage Game) throws Exception{


        Parent root = FXMLLoader.load(getClass().getResource("fxml/Menu.fxml"));
        Scene Menu = new Scene(root,800,600);
        Game.setScene(Menu);
        Game.setResizable(false);
        Game.setTitle("CYBERSNAKE2077");
        File path = new File("src/App/Resources/css/bolt.png");
        Image icon= new Image(path.toURI().toString());
        Game.getIcons().add(icon);
        Game.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
