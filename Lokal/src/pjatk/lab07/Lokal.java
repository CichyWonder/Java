package pjatk.lab07;

import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class Lokal {
    private String nazwaLokalu;
    private String miejscowosc;
    private String kodPocztowy;
    private String ulica;
    private int numerDomu;
    private int numerLokalu;
    public Lokal(String nazwaLokalu, String adres) {
        String[] streetOrCity = Pattern.compile("\\w+",
                Pattern.CASE_INSENSITIVE).matcher(adres).results().map(MatchResult::group).toArray
                (String[]::new);
        this.nazwaLokalu = nazwaLokalu;
        this.miejscowosc = streetOrCity[streetOrCity.length - 1];
        this.kodPocztowy = Pattern.compile("[0-9]{2}-[0-9]{3}").matcher(adres).results().map(MatchResult::group).toArray(String[]::new)[0]
        ;
        this.ulica = adres.split("[0-9]")[0].trim();
        String[] numbers = Pattern.compile("[0-9]/[0-9]|[0-9]").matcher(adres).results().map(MatchResult::group).toArray(String[]::new)[0].split("/");
        this.numerDomu = Integer.parseInt(numbers[0]);
        if (numbers.length > 1) {
            this.numerLokalu = Integer.parseInt(numbers[1]);
        }
    }
    @Override
    public String toString() {
        return nazwaLokalu + '\n' +
                "Miasto: " + miejscowosc + '\n' +
                "Ulica: " + ulica + '\n' +
                "Numer domu/lokalu: " + numerDomu + '/' + numerLokalu + '\n' +
                "Kod pocztowy: " + kodPocztowy;
    }
}
