
public enum Kolor {
    KIER("♡"),
    KARO("♢"),
    TREFL("♣"),
    PIK("♠");
    private String kolor;
    public String getKolor() {
        return kolor;
    }
    private Kolor(String kolor) {
        this.kolor = kolor;
    }
}
