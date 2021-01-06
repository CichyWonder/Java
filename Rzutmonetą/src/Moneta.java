import java.util.Random;

public class Moneta {

    int rzut;
    public static final Random randomoweLiczby = new Random();
    public static final int ORZEŁ= 1;
    public static final int RESZKA = 2;

    public enum Strona{
        ORZEŁ,
        RESZKA,

    }
    public Moneta wyświetl(){


    }
    public Moneta Symulacja(){

        rzut=this.rzut;

        rzut = 1 + randomoweLiczby.nextInt( 2 );

        if ( rzut == 1 )
        {
            System.out.println("Rzuciłeś monetą i wypadł orzeł!");
        }
        else
        {
            System.out.println("Rzuciłeś monetą i wypadła reszka");
        }
        return rzut;

    }

}
