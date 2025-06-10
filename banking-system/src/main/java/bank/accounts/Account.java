package bank.accounts;

import bank.transactions.Transaction;
import java.util.*;

public abstract class Account {
    private static int accountCounter = 1000;

    private final int accountNumber;
    private String holderName;
    protected double balance;
    private final List<Transaction> transactionHistory;


}