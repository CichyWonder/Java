package pjatk.lab07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Wpisz imię:");
            String imie = input.nextLine().trim();
            System.out.println("Wpisz nazwisko:");
            String nazwisko = input.nextLine().trim();
            System.out.println("Wpisz rok urodzenia:");
            int dataUrodzenia = input.nextInt();
            try {
                Osoba andrzej = new Osoba(imie, nazwisko, dataUrodzenia);
                System.out.println(andrzej);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage() + " Nie można stworzyć osoby");
            }
        }
    }
}