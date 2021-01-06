package pl.pjatk.labor2;

import java.util.Scanner;

public class zadanie6 {
    public static void main(String[] args) {

        Scanner skaner1 = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int liczba1 = skaner1.nextInt();
        skaner1.nextLine();

        Scanner skaner2 = new Scanner(System.in);
        System.out.println("Podaj drugą liczbę");
        int liczba2 = skaner2.nextInt();
        skaner2.nextLine();

        System.out.println("Największy wspólny dzielnik wynosi:");
        System.out.println(Licznik(liczba1, liczba2));
    }
    public static int Licznik(int liczba1, int liczba2){
        while (liczba1 != liczba2)
        {
            if (liczba1 > liczba2)
            {
                liczba1 = liczba1 - liczba2;
            }
            else
            {
                liczba2 = liczba2 - liczba1;
            }
        }
        return liczba1;
    }
}
