public class CheckingAccount extends BankAccount{
    private double overdraftLmit = 100.0;

    @Override
    public void deposit(double amount) {
        if (amount > 0){
            balance += amount;
        } else {
            System.out.println("Invalid, please type a right value");
        }
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= balance + overdraftLmit){
            balance -= amount;
        }else {
            System.out.println(" Insufficient balance");
        }
    }
}
