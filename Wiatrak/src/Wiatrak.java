import java.util.Scanner;

public class Wiatrak {
    public static void main(String[] args) {
        Wiatraczek wiatrak1 = new Wiatraczek();

        wiatrak1.speed(1);
        wiatrak1.color("Biały");
        wiatrak1.wiatrakStatus(true);
        wiatrak1.radius(180);

        wiatrak1.Information();

        Wiatraczek wiatrak2 = new Wiatraczek();

        Scanner skan= new Scanner(System.in);

        System.out.print("Włącz lub wyłącz wiatrak(true-false): ");
        boolean statusWiatraka= skan.nextBoolean();
        wiatrak2.wiatrakStatus(statusWiatraka);


        System.out.print("Podaj prędkość wiatraka: ");
        int predkoscWiatraka= skan.nextInt();
        wiatrak2.speed(predkoscWiatraka);

        System.out.print("Podaj kolor Wiatraka: ");
        String kolorWiatraka= skan.next();
        wiatrak2.color(kolorWiatraka);


        System.out.print("Podaj stopnie w jakich ma się poruszać: ");
        int stopnieWiatraka= skan.nextInt();
        wiatrak2.radius(stopnieWiatraka);

        wiatrak2.Information();
    }
}
