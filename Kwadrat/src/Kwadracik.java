public class Kwadracik {
    int bok;

    public Kwadracik(int bok){
        this.bok = bok;
    }
    public int obliczPole(){
        return bok*bok;
    }
    public int obliczObwod(){
        return bok*4;
    }
}
