public class CashRegister {
    private double balance;
    public CashRegister(){
        this.balance = 0.00;
    }
    public double getBalance(){
        return balance;
    }
    public void topUp(double amount){
        balance += amount;
    }
    public double calcChange(double amount){
        double change = 0.00;
        change = balance - amount;
        return change;
    }
}
