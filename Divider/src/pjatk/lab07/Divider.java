package pjatk.lab07;

import javax.swing.*;

public class Divider {
    public static void main(String[] args) {
        int parsedNumber, parsedDivider;
        while (true) {
            String number = JOptionPane.showInputDialog(null, "Podaj liczbę");
            try {
                parsedNumber = Integer.parseInt(number);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Błąd, nie wpisano liczby");
            }
        }
        while (true) {
            String divider = JOptionPane.showInputDialog(null, "Podaj dzielnik");
            try {
                parsedDivider = Integer.parseInt(divider);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Błąd, nie wpisano liczby");
            }
        }
        try {
            int result = parsedNumber/parsedDivider;
            JOptionPane.showMessageDialog(null, String.format("Wynik dzielenia to %d", result));
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Błąd, nie można dzielić przez zero");
        }
    }
}