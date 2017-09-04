package lafore.chap1_Overview;

/**
 * Created by User on 04.09.2017.
 */
public class BankAccount {
    private double balance;

    public BankAccount(double openingBalance) {
        balance = openingBalance;
    }

    public void deposit (double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void display() {
        System.out.println("balance = " + balance);
    }

}

class BankApp {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(99.99);

        System.out.println("Before transactions balance: ");
        bankAccount.display();

        bankAccount.deposit(11.11);
        bankAccount.withdraw(22.22);
        System.out.println("After transactions balance: ");
        bankAccount.display();
    }

}
