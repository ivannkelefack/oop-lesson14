package oop.exercice8;

public class SavingsAccount extends BankAccount implements InterestCalculator {

    // Interest rate — fully encapsulated
    private double interestRate;

    public SavingsAccount(String owner, double initialBalance, double interestRate) {
        super(owner, initialBalance); // passes owner and balance up to BankAccount
        this.interestRate = interestRate;
    }

    // Getter
    public double getInterestRate() { return interestRate; }

    // Calculates interest based on current balance and rate
    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    // Override deposit to print a savings-specific message
    @Override
    public void deposit(double amount) {
        super.deposit(amount); // calls BankAccount's deposit logic
        System.out.println("Savings account updated.");
    }

    // Override withdraw to print a savings-specific message
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount); // calls BankAccount's withdraw logic
        System.out.println("Savings account updated.");
    }

    @Override
    public String toString() {
        return "SavingsAccount{owner='" + getOwner() + "', balance=" + getBalance()
                + ", interestRate=" + interestRate + "%}";
    }
}