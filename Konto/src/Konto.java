public class Konto {
    int id;
    double balance;

    public Konto(){
        this.id = 0;
        this.balance = 0;
    }
    public Konto(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    public void displayBalance() {
        System.out.println("Stan konta to: " + balance);
    }
    public void depositFunds(int amount) {
        balance += amount;
        System.out.println("Wplacam na konto " + amount);
    }
    public void withdrawFunds(int amount) {
        balance-= amount;
        System.out.println("Wyplacam z konta " + amount);
    }
}
