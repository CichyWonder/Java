package App;

import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

import java.io.File;

public class Snake {

    public Rectangle body = fillSnakewithimage();

    private int Xpos;
    private int Ypos;
    private int oldXpos;
    private int oldYpos;

    Snake(int X, int Y)
    {
        oldXpos = Xpos = X;
        oldYpos = Ypos = Y;
    }

    public void setPos(int X, int Y)
    {
        oldXpos =Xpos;
        oldYpos =Ypos;

        Xpos =X;
        Ypos =Y;

    }

    public int getOldXpos()
    { return oldXpos; }

    public int getOldYpos()
    {return oldYpos;}

    public int getXpos()
    {return Xpos; }

    public int getYpos()
    {return Ypos; }

    public Rectangle fillSnakewithimage(){

        File path = new File("src/App/Resources/css/snakebody.jpg");
        Image image = new Image(path.toURI().toString());
        Rectangle body = new Rectangle(16,16);
        body.setFill(new ImagePattern(image));
        return body;

    }
}
