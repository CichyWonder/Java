package pjatk.lab07;

import java.util.Scanner;

public class MainBankException {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Do you want to create an account?");
        boolean doCreateAccount = getYesNoAnswer();
        if (!doCreateAccount) {
            endProgram();
        }
        Account account = createNewAccount();
        System.out.println("Do you want to withdraw money?");
        boolean shouldWithdrawMoney = getYesNoAnswer();

        if (!shouldWithdrawMoney) {
            endProgram();
        }
        System.out.println("How much do you want to withdraw?");
        int amount = getAmount();
        try{
            account.withdraw(amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.printf("Thank you for using our service. Your current balance is %.2f $", account.getBalance());
    }
    private static Account createNewAccount() {
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How much do you want to put down to your account?");
        int initialAmount = getAmount();
        return new Account(name, initialAmount);
    }
    private static int getAmount() {
        try {
            return Integer.parseInt(scanner.nextLine());
        }
        catch (NumberFormatException e){
            System.out.println("Something went wrong, maybe you tried a letter not number \n" + "No funds added to your account");
            return 0;
        }
    }
    private static void endProgram() {
        System.out.println("Thank you for using our service!");
        System.exit(0);
    }
    private static boolean getYesNoAnswer() {
        String userAnswer = scanner.nextLine();
        if (userAnswer.toLowerCase().contains("y")) {
            return true;
        } else if (userAnswer.toLowerCase().contains("n")) {
            return false;
        } else {
            System.out.println("Please enter 'yes' or 'no'.");
            return getYesNoAnswer();
        }
    }
}