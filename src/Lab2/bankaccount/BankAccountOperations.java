package Lab2.bankaccount;

public interface BankAccountOperations {
    void createAccount(double initialBalance);
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
