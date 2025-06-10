package bank.accounts;

import bank.transactions.Transaction;
import bank.exceptions.*;

public class CheckingAccount extends Account {
    private static final double OVERDRAFT_LIMIT = 500.0;

    public CheckingAccount (String holderName, double initialBalance){
        super(holderName, initialBalance);
    }
    @Override
    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit must be positive");
        balance += amount;

    }
    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) throw new IllegalArgumentException("Withdrawal must be positive");
        if (amount > balance + OVERDRAFT_LIMIT)
            throw new InsufficientFundsException("Overdraft limit exceeded");
        balance -= amount;

    }
}