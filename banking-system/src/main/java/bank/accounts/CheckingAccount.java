package bank.accounts;

import bank.transactions.Transaction;
import bank.exceptions.*;

public class CheckingAccount extends Account {
    private static final double OVERDRAFT_LIMIT = 500.0;

    public CheckingAccount (String holderName, double initialBalance){
        super(holderName, initialBalance);
    }
    
}