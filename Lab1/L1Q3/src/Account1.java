import java.util.*;
public class Account1 extends Account{
    private String name;
    ArrayList<Transaction> transactions;
    public Account1(String name, int id, double balance){
        this.name = name;
        this.id = id;
        this.balance = balance;
        transactions = new ArrayList<Transaction>();
    }
    public String getName(){
        return name;
    }
    @Override
    public void withdraw(double amount){
        if (amount < 0){
            System.out.println("Invalid amount! Amount entered must be at least 0.");
        }
        else if (amount <= balance){
            balance -= amount;
            transactions.add(new Transaction('W',amount,balance,"Withdraw"));
        }
        else {
            System.out.println("Insufficient balance in account!");
        }
    }
    @Override
    public void deposit(double amount){
        if (amount < 0){
            System.out.println("Invalid amount! Amount entered must be at least 0.");
        }
        else {
            balance += amount;
            transactions.add(new Transaction('D',amount,balance,"Deposit"));
        }
    }
    public ArrayList<Transaction> getTransactions(){
        return transactions;
    }
}
