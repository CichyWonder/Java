package pl.pjatk.labor2;

import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wielkość tablicy");
        int wielkosc = scanner.nextInt();
        scanner.nextLine();

        int[] tablica = new int[wielkosc];

        System.out.println("Podaj pierwszy element");
        int liczba = scanner.nextInt();
        scanner.nextLine();

        tablica[0] = liczba;

        if (liczba % 2 == 1) {
            liczba = liczba + 1;
        }
        else{
            liczba = liczba + 2;
        }

        for (int i = 1; i < wielkosc; i++) {

            tablica[i] = liczba;
            liczba=liczba + 2;

        }

        for (int i = 0; i < wielkosc; i++) {

            System.out.println(tablica[i]);
        }


        System.out.println(minimalny(liczba,tablica,wielkosc));
        System.out.println(maksymalny(liczba,tablica,wielkosc));
        System.out.println(suma(tablica,wielkosc));
        System.out.println(srednia(tablica,wielkosc));
        System.out.println(mediana(tablica,wielkosc));

    }
    public static int minimalny (int min, int tablica[], int n){

        for (int i=0; i<n; i++)
        {
            if (min > tablica[i])
            {
                min = tablica[i];
            }
        }
        System.out.println("Element minimalny wynosi: ");
        return min;
    }
    public static int maksymalny (int max, int tablica[], int n){

        for (int i=0; i<n; i++)
        {
            if (max < tablica[i])
            {
                max = tablica[i];
            }
        }
        System.out.println("Element maksymalny wynosi: ");
        return max-2;
    }
    public static int suma (int tablica[], int n){

        int suma=0;

        for (int i=0; i<n; i++)
        {
           suma=tablica[i]+suma;
        }
        System.out.println("suma wszystkich elementów wynosi: ");
        return suma;
    }
    public static float srednia (int tablica[], int n){

        float srednia=0;

        for (int i=0; i<n; i++)
        {
            srednia=tablica[i]+srednia;
        }
        srednia=srednia/n;

        System.out.println("średnia elementów wynosi: ");
        return srednia;
    }
    public static float mediana (int tablica[], int n){

        float mediana=0;

        if (n%2 == 0)
        {
            mediana = tablica[(n-1)/2]+tablica[n/2];
            mediana = mediana/2;
        }
        else
        {
            mediana = tablica [n/2];
        }

        System.out.println("mediana elementów wynosi: ");
        return mediana;
    }
}
