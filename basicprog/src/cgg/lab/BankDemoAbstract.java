package cgg.lab;
import java.util.HashMap;
abstract class Account1 {
    private String accNum;
    private double balance;

    public Account1() {
        this.accNum = generateAccountNumber();
        this.balance = 0;
    }

    public abstract void withdraw(double amount);

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accNum;
    }

    private String generateAccountNumber() {
        return String.valueOf((int) (Math.random() * 900000) + 100000);
    }

    @Override
    public String toString() {
        return "Account Number: " + accNum + "\nBalance: INR " + balance;
    }
}

class SavingsAccount1 extends Account1 {
    public SavingsAccount1() {
        super();
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            double newBalance = getBalance() - amount;
            System.out.println("Withdrawn INR " + amount + " from Savings Account");
            System.out.println("Remaining Balance: INR " + newBalance);
            super.deposit(-amount);
        } else {
            System.out.println("Insufficient funds in Savings Account");
        }
    }
}

class CurrentAccount1 extends Account1{
    public CurrentAccount1() {
        super();
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            double newBalance = getBalance() - amount;
            System.out.println("Withdrawn INR " + amount + " from Current Account");
            System.out.println("Remaining Balance: INR " + newBalance);
            super.deposit(-amount);
        } else {
            System.out.println("Insufficient funds in Current Account");
        }
    }
}

public class BankDemoAbstract{
    public static void main(String[] args) {
        HashMap<String, Account1> accounts = new HashMap<>();

     
        Account1 smithAccount = new SavingsAccount1();
        Account1 kathyAccount = new CurrentAccount1();

        accounts.put(smithAccount.getAccountNumber(), smithAccount);
        accounts.put(kathyAccount.getAccountNumber(), kathyAccount);

         
        smithAccount.deposit(2000);

         
        kathyAccount.withdraw(2000);

        
        System.out.println("Smith's Account:");
        System.out.println(accounts.get(smithAccount.getAccountNumber()));
        System.out.println();
        System.out.println("Kathy's Account:");
        System.out.println(accounts.get(kathyAccount.getAccountNumber()));
    }
}
