package bank.accounts;

import bank.transactions.Transaction;
import java.util.*;

public abstract class Account {
    private static int accountCounter = 1000;

    private final int accountNumber;
    private String holderName;
    protected double balance;
    private final List<Transaction> transactionHistory;

    public Account(String holderName, double initialBalance) {
        this.accountNumber = ++accountCounter;
        this.holderName = holderName;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
    }
    public int getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public void setHolderName(String name) { this.holderName = name; }
    public double getBalance() { return balance; }
    public List<Transaction> getTransactionHistory() { return transactionHistory; }

    public void addTransaction(Transaction t) {
        transactionHistory.add(t);
    }



}