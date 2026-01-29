public class SavingAccount extends BankAccount{
    private double monthInterest = 1.5;

    @Override
    public void deposit(double amount) {
        if (amount >0){
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance){
            balance-=amount;
        }else
        {
            System.out.println("Insufficient balance");
        }
    }
    public void applyMonthyInterest(){
        balance += balance * (monthInterest / 100);
    }
}
