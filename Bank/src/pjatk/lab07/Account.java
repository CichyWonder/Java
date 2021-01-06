package pjatk.lab07;

public class Account {
    private String accountName;
    private double balance;
    public Account(String accountName, double initialBalance) {
        this.accountName = accountName;
        this.balance = initialBalance;
    }
    public int withdraw(int amount) throws Exception {
        if (balance-amount < 0) {
            throw new InsufficientFundException();
        } else {
            balance-=amount;
            return amount;
        }
    }
    public double getBalance() {
        return balance;
    }
}

