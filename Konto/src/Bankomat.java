import java.util.Scanner;

public class Bankomat {
    public void mainMenu(Konto [] accounts){
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj id: ");
        int id = scan.nextInt();

        if(id > 0 && id < 11 ) {
            System.out.println("wybierz co chcesz zrobic: ");
            System.out.println("1. Sprawdz stan konta ");
            System.out.println("2. Wplac gotowke ");
            System.out.println("3. Wyplac gotowke ");
            System.out.println("4. Zakończ ");
            int choice;
            int amount;
            int licznik = 0;
            boolean end = true;
            do {
                if(licznik > 0){
                    System.out.print("Wybierz opcje:");
                }
                licznik++;
                choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        accounts[id-1].displayBalance();
                        break;
                    case 2:
                        System.out.print("Podaj kwote: ");
                        amount = scan.nextInt();
                        accounts[id-1].depositFunds(amount);
                        break;
                    case 3:
                        System.out.print("Podaj kwote: ");
                        amount = scan.nextInt();
                        if(accounts[id-1].balance < amount){
                            System.out.println("Nie ma tyle srodkow");
                        }
                        else{
                            accounts[id-1].withdrawFunds(amount);
                        }
                        break;
                    case 4:
                        System.out.print("Podaj id: ");
                        int controlId = scan.nextInt();
                        if(controlId == id) {
                            end = false;
                        }
                        else{
                            System.out.println("Zle id");
                        }
                        break;
                    default:
                        System.out.println("Nie ma takiej instrukcji");
                }
            } while (end == true);
        }
        else{
            System.out.println("Nie ma takiego konta");
        }

    }

}
