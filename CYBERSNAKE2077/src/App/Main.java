package App;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;




public class Main extends Application {



    @Override
    public void start(Stage Game) throws Exception{


        Parent root = FXMLLoader.load(getClass().getResource("fxml/Menu.fxml"));
        Scene Menu = new Scene(root,800,600);
        Game.setScene(Menu);
        Game.setResizable(false);
        Game.setTitle("CYBERSNAKE2077");
        Game.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
