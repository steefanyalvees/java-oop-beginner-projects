abstract class BankAccount {
    protected double balance; //subclass accessam o saldo

    public double getBalance() {
        return balance;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

}
