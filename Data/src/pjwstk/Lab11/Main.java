package pjwstk.Lab11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setSize(700, 180);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));
        window.add(panel);

        JLabel labelC = new JLabel("Podaj miesiąc:");
        panel.add(labelC);

        JTextField textFieldC = new JTextField(5);
        panel.add(textFieldC);

        JLabel labelD = new JLabel("Podaj dzień miesiąca:");
        panel.add(labelD);

        JTextField textFieldD = new JTextField(5);
        panel.add(textFieldD);

        JLabel labelA = new JLabel("Podaj rok:");
        panel.add(labelA);

        JTextField textFieldA = new JTextField(5);
        panel.add(textFieldA);

        JButton button = new JButton("Szukaj");
        button.setBounds(425, 160, 10, 5);
        panel.add(button);

        JLabel labelF = new JLabel("Dzień tygodnia którego szukasz to:");
        panel.add(labelF);
        JTextField textFieldF = new JTextField(5);
        panel.add(textFieldF);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double month = Double.parseDouble(textFieldC.getText());
                double year = Double.parseDouble(textFieldA.getText());
                double day = Double.parseDouble(textFieldD.getText());

                Calendar myCal = Calendar.getInstance();
                myCal.set(Calendar.YEAR, (int) year);
                myCal.set(Calendar.MONTH, (int) month-1);
                myCal.set(Calendar.DAY_OF_MONTH, (int) day);
                Date myDateObj = myCal.getTime();

                SimpleDateFormat dateFormat = new SimpleDateFormat("E");
                textFieldF.setText(String.valueOf(dateFormat.format(myDateObj)));
            }
        });
        window.setVisible(true);
    }
}
