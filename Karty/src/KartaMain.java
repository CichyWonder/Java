public class KartaMain {
    public static void main(String[] args) {

        Karta karta = new Karta(Kolor.KIER, Figura.DWA);

        System.out.println("Talia");
        Karta[] talia = new Karta[52];
        int i = 0;
        for (Figura figury: Figura.values()) {
            for (Kolor kolory: Kolor.values()) {
                talia[i] = new Karta(kolory, figury);
                i++;
            }
        }
        for (Karta karty: talia) {
            System.out.println(karty);
        }
        System.out.println("Twoja karta to : "+karta);
    }

}
