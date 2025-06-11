package bank.transactions;

import bank.accounts.Account;
import bank.exceptions.InsufficientFundsException;


public class WithdrawTransaction implements Transaction {
    private final Account account;
    private final double amount;

    public WithdrawTransaction(Account account, double amount){
        this.account = account;
        this.amount = amount;
    }
 @Override
    public String getDetails() {
        return "Withdrwal tranaction of: " + amount + "from account# " + account.getAccountNumber() + "succesfully"
 }

    @Override
    public void process() {
        try {
            account.withdraw(amount)
        }
        catch ( InsufficientFundsException e){
            System.out.println("Insuffient funds! " + e.getMessage());
        }
    }


}