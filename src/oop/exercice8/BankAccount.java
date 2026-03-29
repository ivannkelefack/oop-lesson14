package oop.exercice8;

public class BankAccount {

    // Full encapsulation
    private String owner;
    private double balance;

    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    // Getters
    public String getOwner() { return owner; }
    public double getBalance() { return balance; }

    // Deposit, adds to balance
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }

    // Withdraw,  throws exception if amount exceeds balance
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds. Balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrew " + amount + ". New balance: " + balance);
    }

    @Override
    public String toString() {
        return "BankAccount{owner='" + owner + "', balance=" + balance + "}";
    }
}