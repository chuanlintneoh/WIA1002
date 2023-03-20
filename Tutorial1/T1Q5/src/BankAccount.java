public class BankAccount implements Account{
    private int balance;
    public BankAccount(int balance){
        this.balance = balance;
    }
    @Override
    public int deposit (int deposit){
        balance += deposit;
        return balance;
    }
    @Override
    public boolean withdraw (int withdraw){
        if (withdraw <= balance){
            balance -= withdraw;
            return true;
        }
        else {
            System.out.println("Insufficient balance!");
            return false;
        }
    }
}
