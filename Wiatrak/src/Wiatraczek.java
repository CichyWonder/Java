public class Wiatraczek {
    String kolor;
    int predkosc;
    int stopnie;


    boolean Status=true;

    public void speed(int predkosc){
        this.predkosc=predkosc;

    }
   public void wiatrakStatus(boolean Status){
        this.Status=Status;
   }
   public void radius(int stopnie){
        this.stopnie=stopnie;
   }
   public void color(String kolor){
        this.kolor=kolor;
    }
   public void Information(){
       System.out.println("Status Wiatraka: "+ Status);
       System.out.println("Prędkość Wiatraka: "+ predkosc);
       System.out.println("Stopnie obrotu: " + stopnie +" stopni");
       System.out.println("Kolor wiatraka: " + kolor);
   }
}
