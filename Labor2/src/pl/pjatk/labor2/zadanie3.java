package pl.pjatk.labor2;

import java.util.Scanner;
import java.util.Random;

public class zadanie3 {
    public static void main(String[] args) {

        Scanner skaner1 = new Scanner(System.in);
        System.out.println("Podaj wielkość pierwszej tablicy");
        int wielkosc1 = skaner1.nextInt();
        skaner1.nextLine();

        Scanner skaner2 = new Scanner(System.in);
        System.out.println("Podaj wielkość drugiej tablicy");
        int wielkosc2 = skaner2.nextInt();
        skaner1.nextLine();

        tworzenie (wielkosc1, wielkosc2);

    }
    public static void tworzenie (int wielkosc1, int wielkosc2){

        int [] tablica1 = new int [wielkosc1];

        for(int i=0; i<wielkosc1; i++){

            Random ran = new Random();
            int randomowy = ran.nextInt(10) + 0;
            tablica1[i]=randomowy;
        }
        for(int i=0; i<wielkosc1; i++){
            System.out.println(tablica1[i]);
        }

        System.out.println("");
        int [] tablica2 = new int [wielkosc2];

        for(int i=0; i<wielkosc2; i++){

            Random ran = new Random();
            int randomowy = ran.nextInt(10) + 0;
            tablica2[i]=randomowy;
        }
        for(int i=0; i<wielkosc2; i++){
            System.out.println(tablica2[i]);
        }

        System.out.println("");

        if(wielkosc1==wielkosc2){

            int [] tablica3 = new int [wielkosc1];
            for(int i=0; i<wielkosc2; i++){
                tablica3[i]= tablica1[i]+tablica2[i];
            }
            System.out.println("Dodawanie Tablic wynosi");
            for(int i=0; i<wielkosc2; i++) {
                System.out.println(tablica3[i]);
            }
        }
        else{
            System.out.println("Tablice mają różne rozmiary");
        }

    }

    }

