public class Argumenty {
    private String pierwszy,drugi,trzeci,czwarty;
    private int miejsce;

    public Argumenty(String pierwszy, String drugi, String trzeci, String czwarty, int miejsce) {

        this.pierwszy = pierwszy;
        this.drugi = drugi;
        this.trzeci = trzeci;
        this.czwarty = czwarty;
        this.miejsce = miejsce;
    }
    @Override public String toString() {
        return "Argumenty{" + "pierwszy=" + pierwszy + ", drugi=" + drugi + ", trzeci=" +
                trzeci + ", czwarty=" + czwarty + ", miejsce='" + miejsce + '\'' + '}';
    }
}
