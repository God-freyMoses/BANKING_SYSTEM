package bank.transactions;

import bank.accounts.Account


public class DepositTransaction implements Transaction {
    private final Account account;
    private final double amount;

    public DepositTransaction(Account account, double amount){

        this.account = account;
        this.amount = amount;
    }

    @Override
    public void process() {
        account.deposit(amount);
    }
    @Override
    public String getDetails() {
        return "Deposit of " + amount "to account #" + account.getAccountNumber();
    }

}