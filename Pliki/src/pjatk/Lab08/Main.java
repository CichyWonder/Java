package pjatk.Lab08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nazwe pliku lub katalogu");
        String name =  scan.next();



        Files file = new Files(name);

        file.displayInformation(name);





    }
}
