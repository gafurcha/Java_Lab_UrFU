package Lab2.bankaccount;

public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.createAccount(1000);

        account.deposit(500);
        System.out.println("Current Balance: " + account.getBalance());

        account.withdraw(200);
        System.out.println("Current Balance: " + account.getBalance());

        account.withdraw(1500); // Attempt to withdraw more than the balance
    }
}
