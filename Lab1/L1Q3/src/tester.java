public class tester {
    public static void main(String[] args) {
        L1Q4();
    }
    public static void L1Q3(){
        Account a = new Account(1122,20000);
        Account.setAnnualInterestRate(4.5);
        a.withdraw(2500);
        a.deposit(3000);
        System.out.printf("ID: %d\n",a.getId());
        System.out.printf("Annual Interest Rate: %.2f%%\n",Account.getAnnualInterestRate());
        System.out.printf("Monthly Interest Rate: %.2f%%\n",Account.getMonthlyInterestRate());
        System.out.printf("Balance: %.2f\n",a.getBalance());
        System.out.printf("Monthly Interest: %.2f\n",a.getMonthlyInterest());
        System.out.printf("Date Created: %s\n",a.getDateCreated());
    }
    public static void L1Q4(){
        Account1 b = new Account1("George",1122,1000);
        Account1.setAnnualInterestRate(1.5);
        b.deposit(30);
        b.withdraw(5);
        b.withdraw(4);
        b.deposit(40);
        b.withdraw(2);
        b.deposit(50);
        System.out.printf("Name: %s\n",b.getName());
        System.out.printf("ID: %d\n",b.getId());
        System.out.printf("Annual Interest Rate: %.2f%%\n",Account1.getAnnualInterestRate());
        System.out.printf("Monthly Interest Rate: %.2f%%\n",Account1.getMonthlyInterestRate());
        System.out.printf("Balance: %.2f\n",b.getBalance());
        System.out.printf("Monthly Interest: %.2f\n",b.getMonthlyInterest());
        System.out.printf("Date Created: %s\n",b.getDateCreated());
        System.out.println("Transactions: ");
        System.out.printf("%s\n",b.getTransactions());
    }
}
