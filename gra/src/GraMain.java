import java.util.Scanner;

public class GraMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Grajmy");
        System.out.println("Podaj zakres losowanej liczby: ");
        int poczatkowyZakres = scanner.nextInt();
        int koncowyzakres = scanner.nextInt();
        int wybierzLiczbe;
        Gra liczba = new Gra(poczatkowyZakres, koncowyzakres);
        boolean trafionaLiczba = false;
        for (int i = 0; i < 5; i++) {
            System.out.println("Zgadnij wylosowaną liczbę: ");
            wybierzLiczbe = scanner.nextInt();
            trafionaLiczba = liczba.czyTrafil(wybierzLiczbe);
            if(trafionaLiczba) {
                System.out.println("Wygrana!!, Trafileś wylosowaną liczbę, którą była " +
                        liczba.getWylosowana());
                break;
            }
        }
        if(!trafionaLiczba) {
            System.out.println("Przegrana, wylosowana liczba to: " + liczba.getWylosowana());
        }
    }
}