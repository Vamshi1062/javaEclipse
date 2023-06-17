package cgg.lab;

import java.util.Random;

class Account {
    protected String accNum;
    protected String accountHolder;
    protected double balance;

    public Account(String accountHolder, double initialBalance) {
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

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account Number: " + accNum +
                "\nAccount Holder: " + accountHolder +
                "\nBalance: INR " + balance;
    }
}

class SavingsAccount extends Account {
    private final double minimumBalance;

    public SavingsAccount(String accountHolder, double initialBalance, double minimumBalance) {
        super(accountHolder, initialBalance);
        this.minimumBalance = minimumBalance;
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= minimumBalance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Withdrawal not allowed. Minimum balance limit reached!");
            return false;
        }
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountHolder, double initialBalance, double overdraftLimit) {
        super(accountHolder, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Withdrawal not allowed. Overdraft limit reached!");
            return false;
        }
    }
}

public class BankDemo1 {
    public static void main(String[] args) {
        SavingsAccount smithSavings = new SavingsAccount("Smith", 2000, 500);
        CurrentAccount kathyCurrent = new CurrentAccount("Kathy", 3000, 2000);

        smithSavings.deposit(2000);
        kathyCurrent.withdraw(2000);

        System.out.println("Updated Balances:");
        System.out.println("Smith's Savings Account: " + smithSavings.getBalance());
        System.out.println("Kathy's Current Account: " + kathyCurrent.getBalance());

        System.out.println("\nAccount Details:");
        System.out.println(smithSavings.toString());
        System.out.println();
        System.out.println(kathyCurrent.toString());
    }
}

