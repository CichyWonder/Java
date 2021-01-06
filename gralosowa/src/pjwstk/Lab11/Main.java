package pjwstk.Lab11;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int liczbaWylosowana = 1 + random.nextInt(100);

        JFrame window = new JFrame();
        window.setSize(350, 300);
        window.setTitle("Zgadnij liczbę");
        window.setLocationRelativeTo(null);
        window.setLayout(null);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel zapytanie1 = new JLabel("Program losuje liczby w przedziale 1 - 100");
        zapytanie1.setBounds(20, 20, 250, 20);
        window.add(zapytanie1);


        JLabel zapytanie = new JLabel("Wpisz liczbę: ");
        zapytanie.setBounds(20, 50, 100, 20);
        window.add(zapytanie);


        JTextField tekstWpisany = new JTextField(10);
        tekstWpisany.setBounds(110, 50, 30, 20);
        window.add(tekstWpisany);


        JButton przycisk = new JButton("Losuj");
        przycisk.setBounds(155, 50, 100, 20);
        window.add(przycisk);


        JLabel odpowiedz = new JLabel();
        odpowiedz.setBounds(20, 80, 200, 20);
        window.add(odpowiedz);

        przycisk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int liczbaWpisana = Integer.parseInt(tekstWpisany.getText());

                if ( liczbaWpisana < liczbaWylosowana)
                    odpowiedz.setText(new String("Liczba jest za mała"));

                else if (liczbaWpisana > liczbaWylosowana)
                    odpowiedz.setText(new String("Liczba jest za duża"));

                else
                    odpowiedz.setText(new String("Zgadłeś!"));
            }
        });

        window.setVisible(true);
    }
}
