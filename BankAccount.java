public class BankAccount {
    private double balance;

    public void deposit(double deposit) {
        this.balance += deposit;
    }

    public void withdraw(double withdraw) {
        this.balance -= withdraw;
    }

    public double getBalance() {
        return balance;
    }
}