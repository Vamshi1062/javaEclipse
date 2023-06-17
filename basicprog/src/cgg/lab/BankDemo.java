package cgg.lab;
import java.util.Random;

class BankAccount {
    private String accNum;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accNum = generateAccNum();
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    private String generateAccNum() {
        Random rand = new Random();
        int accNum = rand.nextInt(900000) + 100000;
        return "ACC" + accNum;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account Number: " + accNum + "\nAccount Holder: " + accountHolder + "\nBalance: INR " + balance;
    }
}
public class BankDemo {
    public static void main(String[] args) {
    	BankAccount smithAccount = new BankAccount("Smith", 2000);
        BankAccount kathyAccount = new BankAccount("Kathy", 3000);

        smithAccount.deposit(2000);
        kathyAccount.withdraw(2000);

        System.out.println("Updated Balances:");
        System.out.println("Smith's Account: " + smithAccount.getBalance());
        System.out.println("Kathy's Account: " + kathyAccount.getBalance());

        System.out.println("\nAccount Details:");
        System.out.println(smithAccount.toString());
        System.out.println();
        System.out.println(kathyAccount.toString());
    }
}
