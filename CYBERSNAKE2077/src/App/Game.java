package App;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Game extends Main{


    private Control control = new Control();

    private GridPane GameGrid = new GridPane();
    private GridPane TextGrid = new GridPane();

    private int GridSizeSquared = 49;

    Label Score = new Label("       Wynik: 0");

    Label GameOver = new Label();

    Label Pause = new Label(" Wciśnij dowolny przycisk \n żeby zacząć");

    Label ControlU= new Label(" ["+control.getUp()+"/GÓRA]");
    Label ControlD= new Label(" ["+control.getDown()+"/DÓŁ]");
    Label ControlL= new Label(" ["+control.getLeft()+"/LEWO] ");
    Label ControlR= new Label(" ["+control.getRight()+"/PRAWO]");

    Label Close = new Label(" Wciśnij ESC żeby wyjść");

    Label Nick= new Label("Podaj swój nick");
    TextField User = new TextField();
    Button Submit = new Button("Wyślij wynik");


    private ArrayList<Snake> SnakeP = new ArrayList<>(0);


    private Timeline Loop;

    //Jak często pętla jest odświeżana
    //1/15 seconds == 15fps
    private double LoopSpeed = 1/15.0;

    //movementX and movementY, wskazują one kierunek głowy węża
    private int mX = 0, mY = 0;

    //Pozycja głowy podczas startu
    private int posX = new Random().nextInt(GridSizeSquared), posY =new Random().nextInt(GridSizeSquared);


    private Rectangle Food = new Rectangle(12,12, Color.RED);

    //Trzyma Wynik
    private int foodN = 0;

    //Losowa pozycja jedzenia na planszy
    private int FoodPosX = new Random().nextInt(GridSizeSquared);
    private int FoodPosY = new Random().nextInt(GridSizeSquared);

    //True = Gra chodzi
    //False = Gra jest zapauzowana
    private boolean start = false;

    private boolean dead = false;

    public void start(Stage PrimaryStage)
    {
        FillGrid(GameGrid);

        //Tworzy głowę
        SnakeP.add(new Snake(posX, posY));



        GameGrid.setAlignment(Pos.CENTER);
        TextGrid.setAlignment(Pos.CENTER);

        //Ustawia jedzienie i głowę na mapie
        GameGrid.add(Food, FoodPosX,FoodPosY);
        GameGrid.add(SnakeP.get(0).body, posX,posY);

        TextGrid.add(Score, 0, 1,1,2);
        TextGrid.add(GameOver, 0, 4,1,2);
        TextGrid.add(Pause, 0, 7,1,2);
        TextGrid.add(ControlU, 0, 10,1,2);
        TextGrid.add(ControlL, 0, 13,1,2);
        TextGrid.add(ControlD, 0, 16,1,2);
        TextGrid.add(ControlR, 0, 19,1,2);
        TextGrid.add(Close, 0, 22, 2, 2);

        Score.setId("Score");
        Score.setAlignment(Pos.CENTER);
        Pause.centerShapeProperty();

        User.setId("User");
        Submit.setId("Submit");



        FlowPane Screen = new FlowPane(Orientation.VERTICAL,GameGrid, TextGrid);
        TextGrid.setPrefHeight(600);
        Screen.setId("Scene");

        GameGrid.setId("GameGrid");
        TextGrid.setId("TextGrid");




        Scene Game = new Scene(Screen, 970 ,608);



        //Sprawdza jakie przyciski są wpisane
        Game.setOnKeyPressed(this::KeyPressedProcess);

        //Generates Window
        PrimaryStage.setTitle("CYBERSNAKE2077");
        PrimaryStage.setScene(Game);
        Game.getStylesheets().add(getClass().getResource("Resources/css/Game.css").toExternalForm());
        PrimaryStage.show();

        //Tworzy pętle gry
        Loop = new Timeline(new KeyFrame(Duration.seconds(LoopSpeed),
                new EventHandler<ActionEvent>()
                {

                    @Override
                    public void handle(ActionEvent event) {

                        //Metoda sterowania wężem
                        MoveChar();
                    }
                }));
        Loop.setCycleCount(Timeline.INDEFINITE);



    }

    public void MoveChar()
    {
        //if-else gdy wąż walnie w ścianę
        //if sam siebie zje
        if(mX == -1 && (posX == 0))
        {Die();
            mX =0;
        }
        else if(mY == -1 && (posY == 0))
        { Die();
            mY =0;
        }
        else if(mX == 1 && (posX == GridSizeSquared-1))
        { Die(); mX =0;}
        else if(mY == 1 && (posY == GridSizeSquared-1))
        {Die(); mY =0; }



        else
        {

            //aktualizuje pozycje głowy
            GameGrid.getChildren().remove(SnakeP.get(0).body);
            posX+=mX;
            posY+=mY;
            GameGrid.add(SnakeP.get(0).body, posX,posY);
            SnakeP.get(0).setPos(posX,posY);

            //Aktualizuje resztę ciałą
            if(SnakeP.size() > 1)
            {
                for(int x = 1; x<SnakeP.size();x++)
                {
                    GameGrid.getChildren().remove(SnakeP.get(x).body);
                    GameGrid.add(SnakeP.get(x).body, SnakeP.get(x-1).getOldXpos(),SnakeP.get(x-1).getOldYpos());
                    SnakeP.get(x).setPos(SnakeP.get(x-1).getOldXpos(),SnakeP.get(x-1).getOldYpos());
                }

            }

            //jeżeli wąż zje to rośnie
            if(posX == FoodPosX && posY == FoodPosY)
            {

                Grow();
            }

            //If sam siebie zje to umiera
            for(int x = 1; x<SnakeP.size();x++)
            {
                if(posX == SnakeP.get(x).getXpos() && posY == SnakeP.get(x).getYpos() )
                {
                    Die();
                }
            }


        }



    }

    //Detekcja przycisków
    public void KeyPressedProcess(KeyEvent event)
    {

        if(start == false && dead && event.getCode()== KeyCode.ENTER)
        {
            Pause.setText("Naciśnij Enter żeby zapauzować");
            Score.setText("Wynik: 0");
            GameOver.setText("");
            Loop.play();
            start = true;
            dead = false;
        }

        else if(start == false && dead == false)
        {
            Pause.setText("Wciśnij Enter żeby zapauzować");
            Loop.play();
            start = true;
        }


        if (event.getCode() == KeyCode.ENTER)
        {
            Pause.setText("Wciśnij dowolny przycisk żeby wznowić");
            TextGrid.disabledProperty();
            Loop.stop();
            start = false;
        }


        if(mY ==0 && (event.getCode() == KeyCode.valueOf(control.getUp()) || event.getCode() == KeyCode.UP))
        {
            mX = 0;
            mY = -1;
        }

        else if(mY == 0 && (event.getCode() == KeyCode.valueOf(control.getDown()) || event.getCode() == KeyCode.DOWN))
        {
            mX = 0;
            mY = 1;
        }

        else if(mX ==0 && (event.getCode() == KeyCode.valueOf(control.getLeft()) || event.getCode() == KeyCode.LEFT))
        {
            mX = -1;
            mY = 0;
        }

        else if(mX == 0 && (event.getCode() ==  KeyCode.valueOf(control.getRight()) || event.getCode() == KeyCode.RIGHT))
        {
            mX = 1;
            mY = 0;
        }


        if(event.getCode() == KeyCode.ESCAPE)
            System.exit(0);


    }

    //Uzupełnia siatkę prostokątami
    public void FillGrid(GridPane GameGrid)
    {
        for(int x =0;x<GridSizeSquared;x++)
        {
            GameGrid.addColumn(x,new Rectangle(12,12, Color.TRANSPARENT));

            for(int y = 1; y < GridSizeSquared;y++)
                GameGrid.addRow(y,new Rectangle(12,12, Color.TRANSPARENT));

        }

    }

    //Randomowo zmienia pozycje jedzenia
    public void PlaceFood()
    {
        Random rPos = new Random();

        int newPosX =  rPos.nextInt(GridSizeSquared);
        int newPosY =  rPos.nextInt(GridSizeSquared);

        FoodPosX = newPosX;
        FoodPosY = newPosY;

        GameGrid.getChildren().remove(Food);
        GameGrid.add(Food, newPosX,newPosY);

    }


    public void Grow()
    {
        //dodaje nową część ogona i sprawdza gdzie była poprzednia
        SnakeP.add(new Snake(SnakeP.get(SnakeP.size()-1).getOldXpos(),
                SnakeP.get(SnakeP.size()-1).getOldYpos()));

        GameGrid.add(SnakeP.get(SnakeP.size()-1).body,
                SnakeP.get(SnakeP.size()-1).getOldXpos(),
                SnakeP.get(SnakeP.size()-1).getOldYpos());

        foodN=foodN+100;
        Score.setText("         Wynik: " + foodN);
        //Zwiększa wynik

        //Randomowo umieszca jedzenie
        PlaceFood();

    }

    //Game Over
    public void Die()
    {

        int size = SnakeP.size();


        //Usuwa węża
        for(int x = size-1; x>0;x--)
            GameGrid.getChildren().remove(SnakeP.get(x).body);

        //Usuwa głowę
        for(int x = size-1; x>0;x--)
            SnakeP.remove(x);


        start = false;
        dead = true;
        Loop.stop();

        HighScore();
        GameOver.setText(" Koniec gry, Chcesz zacząć od początku?");
        Pause.setText(" Wciśnij Enter żeby zrestartować");

        //Nowa pozycja dla węża
        posX = new Random().nextInt(GridSizeSquared);
        posY = new Random().nextInt(GridSizeSquared);

        //Umieszcza węża na siatce
        GameGrid.getChildren().remove(SnakeP.get(0).body);
        GameGrid.add(SnakeP.get(0).body,posX,posY);
        SnakeP.get(0).setPos(posX,posY);

        foodN = 0;


    }
    public void HighScore() {
        TextGrid.add(Nick, 0, 25, 1, 2);
        TextGrid.add(User, 0, 28, 1, 2);
        TextGrid.add(Submit, 0, 31, 1, 2);

        Submit.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

                String nick = User.getText();
               // try {
                    //HighScoreWriter(nick);
                //} catch (FileNotFoundException e) {
                   // e.printStackTrace();
                //}
                TextGrid.getChildren().remove(User);
                TextGrid.getChildren().remove(Submit);
                TextGrid.getChildren().remove(Nick);
            }
        });
    }
    // do poprawienia
    public void HighScoreWriter(String nick) throws FileNotFoundException {
        int[] fiveBestScores= new int[6];
        File file = new File("src/App/Resources/css/Highscores.txt");
        Scanner overrite = new Scanner(file);
        String space = "";
        while (overrite.hasNextLine()){
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(space);
            int i =0;

            while (matcher.find()){
                fiveBestScores[i] = Integer.parseInt(matcher.group());
                i++;
            }
            FileWriter save = null;

            try {
                save = new FileWriter(file);
                if(foodN> fiveBestScores[0]){
                    save. write(space.replaceAll("a\\)\\s\\d+\\s pkt", "a)"+ foodN + nick));
                }

            }catch (IOException e){
                e.printStackTrace();
            }
            finally {
                try{
                    save.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}

