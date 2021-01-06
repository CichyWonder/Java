import java.util.Scanner;

public class Kwadrat {
    public static void main(String[] args) {



        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj wielkość kwadratu: ");
        int wielkosc=skaner.nextInt();
        skaner.nextLine();

        Kwadracik kwadrat = new Kwadracik(wielkosc);


        System.out.println("Obwód kwadratu wynosi: " + kwadrat.obliczObwod());
        System.out.println("Pole Kwadratu wynosi: " + kwadrat.obliczPole());
    }
}
