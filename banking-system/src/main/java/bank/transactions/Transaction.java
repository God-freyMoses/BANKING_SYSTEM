package bank.transactions;

public interface Transaction {
    void process();
    String getDetails();
}