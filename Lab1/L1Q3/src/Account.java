import java.time.LocalDate;
public class Account {
    protected int id;
    protected double balance;
    private static double annualInterestRate = 0;
    private final LocalDate dateCreated;
    private static double monthlyInterestRate;
    public Account(){
        setId(0);
        setBalance(0);
        dateCreated = LocalDate.now();
    }
    public Account(int id, double balance){
        setId(id);
        setBalance(balance);
        dateCreated = LocalDate.now();
    }
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public static double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public static void setAnnualInterestRate(double annualInterestRate){
        Account.annualInterestRate = annualInterestRate;
    }
    public LocalDate getDateCreated(){
        return dateCreated;
    }
    public static double getMonthlyInterestRate(){
        monthlyInterestRate = annualInterestRate/12;
        return monthlyInterestRate;
    }
    public double getMonthlyInterest(){
        getMonthlyInterestRate();
        return balance*(monthlyInterestRate/100);
    }
    public void withdraw(double amount){
        if (amount < 0){
            System.out.println("Invalid amount! Amount entered must be at least 0.");
        }
        else if (amount <= balance){
            balance -= amount;
        }
        else {
            System.out.println("Insufficient balance in account!");
        }
    }
    public void deposit(double amount){
        if (amount < 0){
            System.out.println("Invalid amount! Amount entered must be at least 0.");
        }
        else {
            balance += amount;
        }
    }
}