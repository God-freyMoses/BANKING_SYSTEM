package  bank.accounts;

import bank.transactions.Transaction
import bank.exceptions.*

public class SavingsAccount extends Account {

    private static final double INTEREST_RATE = 0.03;

    public SavingsAccount(String holderName, double initialBalance) {
        super(holderName, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit cannot be negative");
        }
        balance +=amount;
    }

    @Override
    public void withdraw(double amount) throws InsufficientFunds {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal cannot be negative");
        }
        if (amount > balance) {
            throw new InsufficientFunds("You don't have enough MONEY...GO HUSTLE!");
        }
        balance -= amount;

    }
    public final void addInterest() {
        double interest = INTEREST_RATE * balance;
        balance += interest ;
    }
}