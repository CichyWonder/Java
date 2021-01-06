package pjatk.lab07;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int dataUrodzenia;
    public Osoba(String imie, String nazwisko, int dataUrodzenia) throws Exception
    {
        sprawdzDaneOsoby(imie, nazwisko, dataUrodzenia);
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }
    public void sprawdzDaneOsoby(String imie, String nazwisko, int dataUrodzenia)
            throws Exception {
        if (imie.equals("")) {
            throw new Exception("Podano niewłaściwe imie!");
        } else if (nazwisko.equals("")) {
            throw new Exception("Podano niewłaściwe nazwisko!");
        } else if (dataUrodzenia < 1900 || dataUrodzenia > 2020) {
            throw new Exception("Podano niewłaściwy rok urodzenia!");
        }
    }
    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", data urodzenia=" + dataUrodzenia +
                '}';
    }
}

