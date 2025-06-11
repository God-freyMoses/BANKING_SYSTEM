package bank;

public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.run();
        SavingsAccount account = new SavingsAccount("Alice", 1000);
        WithdrawTransaction tx = new WithdrawTransaction(account, 500);
        tx.process();
    }
}