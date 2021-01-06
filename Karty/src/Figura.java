public enum Figura {
    DWA("2"),
    TRZY("3"),
    CZTERY("4"),
    PIEC("5"),
    SZESC("6"),
    SIEDEM("7"),
    OSIEM("8"),
    DZIEWIEC("9"),
    DZIESIEC("10"),
    WALET("Walet"),
    DAMA("Dama"),
    KROL("Krol"),
    AS("As");
    private String figura;
    public String getFigura() {
        return figura;
    }
    private Figura(String figura) {
        this.figura = figura;
    }
}
