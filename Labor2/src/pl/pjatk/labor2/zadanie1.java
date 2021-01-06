package pl.pjatk.labor2;

import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wielkość tablicy");
        int wielkosc=scanner.nextInt();
        scanner.nextLine();

        String [] tablica = new String [wielkosc];
            for(int i=0 ; i<wielkosc; i++){
                System.out.println("Wpisz element #"+i);
                    tablica [i]=scanner.nextLine();
            }
            for(int i=0; i<wielkosc;i++){
                System.out.println(tablica[i]);
            }

    }
}
