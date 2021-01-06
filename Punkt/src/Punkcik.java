public class Punkcik {
    int x;
    int y;
    int w;
    int z;
    double wynik;
    int Wartosc1;
    int Wartosc2;

    public Punkcik(){
        this.x=0;
        this.y=0;
    }
    public Punkcik(int x,int y){
        this.w=x;
        this.z=y;
    }
    public void Odległość() {
         double wynik;
         wynik=(x*x+w*w)+(y*y+z*z);
        this.wynik=wynik;
    }
    public void wartoscPunktu(){
        System.out.println("Pierwszy punkt ma odległość: "+wynik);
    }

}
