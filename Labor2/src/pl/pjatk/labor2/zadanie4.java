package pl.pjatk.labor2;

import java.util.Random;
import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj wielkość macierzy");
        int wielkosc = skaner.nextInt();
        skaner.nextLine();

        macierz(wielkosc);

    }

    public static void macierz(int wielkosc) {

        int[][] tablica = new int[wielkosc][wielkosc];
        int[][] tablica2 = new int[wielkosc][wielkosc];

        for (int i = 0; i < wielkosc; i++) {
            for (int j = 0; j < wielkosc; j++) {

                Random ran = new Random();
                int randomowy = ran.nextInt(10) + 0;
                int randomowy2 = ran.nextInt(10) + 0;
                tablica[i][j] = randomowy;
                tablica2[i][j] = randomowy2;
            }

        }

        wyswietlanie(tablica, wielkosc);
        System.out.println();
        wyswietlanie(tablica2, wielkosc);
        System.out.println();
        dodawanie(tablica,tablica2,wielkosc);

    }

    public static void wyswietlanie(int macierz[][], int wielkosc) {

        for (int i = 0; i < wielkosc; i++) {
            for (int j = 0; j < wielkosc; j++) {

                System.out.print(macierz[i][j]);
                System.out.print(" ");

            }
            System.out.println();
        }


    }
    public static void dodawanie(int macierz1[][], int macierz2[][],int wielkosc) {

        int[][] macierz3 = new int[wielkosc][wielkosc];

        for (int i = 0; i < wielkosc; i++) {
            for (int j = 0; j < wielkosc; j++) {

                macierz3[i][j]=macierz1[i][j]+macierz2[i][j];
            }

        }

        System.out.println("Dodawanie macierzy wynosi:");
        wyswietlanie(macierz3,wielkosc);
    }
}
