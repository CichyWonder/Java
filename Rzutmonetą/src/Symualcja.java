import java.util.Scanner;

public class Symualcja {
    public static void main(String[] args) {
        Scanner skan= new Scanner (System.in);

        System.out.println("Witaj w symultorze rzutu monetą");
        System.out.println("Podaj ilość rzutów: ");

        int rzut = skan.nextInt();

        Moneta moneta = new Moneta();
        moneta.Symulacja(rzut);
    }
}
