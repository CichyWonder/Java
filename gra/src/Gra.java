import java.util.Random;

public class Gra {
    private int liczbaStartowa;
    private int liczbaKoncowa;
    private int wylosowana;
    Random random = new Random();

    public Gra(int liczbaStartowa, int liczbaKoncowa) {
        this.liczbaStartowa = liczbaStartowa;
        this.liczbaKoncowa = liczbaKoncowa;
        this.wylosowana = random.nextInt((liczbaKoncowa - liczbaStartowa) + 1) + liczbaStartowa;
    }

    public int getWylosowana() {
        return wylosowana;
    }

    public boolean czyTrafil(int liczba) {
        if (liczba == wylosowana) {
            return true;
        } else {
            if (liczba > wylosowana) {
                System.out.println("Podałeś za dużą liczbę");
            } else if (liczba < wylosowana) {
                System.out.println("Podałes za małą liczbę");
            }
            return false;
        }
    }
}