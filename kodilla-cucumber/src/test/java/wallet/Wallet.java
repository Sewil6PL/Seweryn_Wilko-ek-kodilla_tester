package wallet;

public class Wallet {
    private int balance = 0;

    public Wallet() {
        this.balance = 0;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void debit(int amount) {
        this.balance -= amount;
    }

    public int getBalance() {
        return this.balance;
    }
}