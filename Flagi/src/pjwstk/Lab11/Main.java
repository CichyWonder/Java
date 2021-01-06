package pjwstk.Lab11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();


        JFrame window = new JFrame("Flagi");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(800,600);
        window.setLocationRelativeTo(null);
        window.setLayout(new GridLayout(1,1));


        JTextField pole1 = new JTextField(2);
        pole1.setSize(60,30);
        window.add(pole1);
        pole1.setText(String.valueOf( 1 + random.nextInt(5)));

        JTextField pole2 = new JTextField(2);
        pole2.setSize(60,30);
        window.add(pole2);
        pole2.setText(String.valueOf( 1 + random.nextInt(5)));

        JTextField pole3 = new JTextField(2);
        pole3.setSize(60,30);
        window.add(pole3);
        pole3.setText(String.valueOf( 1 + random.nextInt(5)));


        JButton button = new JButton("Wyświetl");
        window.add(button);

        JPanel lowerPanel = new JPanel();
        lowerPanel.setLayout(new GridLayout(3,1));
        window.add(lowerPanel);

        JLabel labelWest = new JLabel();
        lowerPanel.add(labelWest);
        JLabel labelCenter = new JLabel();
        lowerPanel.add(labelCenter);
        JLabel labelEast = new JLabel();
        lowerPanel.add(labelEast);



        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                switch (pole1.getText()) {
                    case "1":
                        labelWest.setIcon(new ImageIcon("C:\\Programowanie\\Java\\Flags\\germany.jpg"));
                        break;
                    case "2":
                        labelWest.setIcon(new ImageIcon("C:\\Programowanie\\Java\\Flags\\israel.jpg"));
                        break;
                    case "3":
                        labelWest.setIcon(new ImageIcon("C:\\Programowanie\\Java\\Flags\\columbia.jpg"));
                        break;
                    case "4":
                        labelWest.setIcon(new ImageIcon("C:\\Programowanie\\Java\\Flags\\china.jpg"));
                        break;
                    case "5":
                        labelWest.setIcon(new ImageIcon("C:\\Programowanie\\Java\\Flags\\usa.jpg"));
                        break;
                }
                switch (pole2.getText()) {
                    case "1":
                        labelCenter.setIcon(new ImageIcon("C:\\Programowanie\\Java\\Flags\\germany.jpg"));
                        break;
                    case "2":
                        labelCenter.setIcon(new ImageIcon("C:\\Programowanie\\Java\\Flags\\israel.jpg"));
                        break;
                    case "3":
                        labelCenter.setIcon(new ImageIcon("C:\\Programowanie\\Java\\Flags\\columbia.jpg"));
                        break;
                    case "4":
                        labelCenter.setIcon(new ImageIcon("C:\\Programowanie\\Java\\Flags\\china.jpg"));
                        break;
                    case "5":
                        labelCenter.setIcon(new ImageIcon("C:\\Programowanie\\Java\\Flags\\usa.jpg"));
                        break;
                }
                switch (pole3.getText()) {
                    case "1":
                        labelEast.setIcon(new ImageIcon("C:\\Programowanie\\Java\\Flags\\germany.jpg"));
                        break;
                    case "2":
                        labelEast.setIcon(new ImageIcon("C:\\Programowanie\\Java\\Flags\\israel.jpg"));
                        break;
                    case "3":
                        labelEast.setIcon(new ImageIcon("C:\\Programowanie\\Java\\Flags\\columbia.jpg"));
                        break;
                    case "4":
                        labelEast.setIcon(new ImageIcon("C:\\Programowanie\\Java\\Flags\\china.jpg"));
                        break;
                    case "5":
                        labelEast.setIcon(new ImageIcon("C:\\Programowanie\\Java\\Flags\\usa.jpg"));
                        break;
                }


            }

        });



        window.setVisible(true);

    }
}
