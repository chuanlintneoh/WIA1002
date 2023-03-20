import java.time.LocalDateTime;
public class Transaction {
    private LocalDateTime date;
    private char type;
    private double amount;
    private double balance;
    private String description;
    public Transaction(char type, double amount, double balance, String description){
        this.date = LocalDateTime.now();
        setType(type);
        setAmount(amount);
        setBalance(balance);
        setDescription(description);
    }
    public LocalDateTime getDate(){
        return date;
    }
    public void setType(char type){
        this.type = type;
    }
    public char getType(){
        return type;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
    public double getAmount(){
        return amount;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
    @Override
    public String toString(){
        return String.format("\nDate: %s | Type: %c | Amount: %.2f | Balance: %.2f | Description: %s",date,type,amount,balance,description);
    }
}
