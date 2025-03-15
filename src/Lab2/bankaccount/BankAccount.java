package Lab2.bankaccount;

public class BankAccount implements BankAccountOperations {
    private double balance;

    @Override
    public void createAccount(double initialBalance) {
        this.balance = initialBalance;
        System.out.println("Account created with initial balance: " + initialBalance);
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient funds. Withdrawal denied.");
        } else {
            this.balance -= amount;
            System.out.println("Withdrew: " + amount);
        }
    }

    @Override
    public double getBalance() {
        return this.balance;
    }
}
