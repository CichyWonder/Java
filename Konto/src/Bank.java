public class Bank {
    public static void main(String[] args) {
        Konto [] accounts = new Konto[10];
        for(int i = 0; i <10; i++){
            accounts[i] = new Konto(i+1,100);
        }

        Bankomat bankomat = new Bankomat();
        bankomat.mainMenu(accounts);
    }
}
