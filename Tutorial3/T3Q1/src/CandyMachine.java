import java.util.*;
public class CandyMachine {
    private Dispenser candyDispenser;
    private Dispenser chipsDispenser;
    private Dispenser gumDispenser;
    private Dispenser cookiesDispenser;
    private Dispenser[] dispensers;
    private CashRegister cashRegister;
    private ArrayList<Dispenser> cart = new ArrayList<>();
    private double cost;
    public CandyMachine(){
        candyDispenser = new Dispenser("Candy",2.30,20);
        chipsDispenser = new Dispenser("Chips",5.70,10);
        gumDispenser = new Dispenser("Gum",0.50,50);
        cookiesDispenser = new Dispenser("Cookies",4.40,10);
        dispensers = new Dispenser[]{candyDispenser,chipsDispenser,gumDispenser,cookiesDispenser};
        cashRegister = new CashRegister();
        cost = 0.00;
    }
    public void displayItems(){
        System.out.println("Items:");
        System.out.printf("%-4s\t%-10s\t%-10s\t%-5s\n","Option","Items","Price(RM)","Stock");
        int option = 0;
        for (Dispenser dispenser:dispensers){
            System.out.printf("%-4s\t%-10s\t%-10.2f\t%5d\n",option,dispenser.getItem(),dispenser.getPrice(),dispenser.getStock());
            option++;
        }
    }
    public void addCart(int select, int quantity){
        for (int i = 1; i <= quantity; i++){
            if (dispensers[select].getStock() == 0){
                System.out.println("Insufficient stock!");
                break;
            }
            cart.add(dispensers[select]);
            cost += dispensers[select].getPrice();
            dispensers[select].setStock(dispensers[select].getStock()-1);
        }
    }
    public void showPrice(){
        System.out.printf("%3s\t%-10s\t%-10s\n","No.","Items","Price(RM)");
        for (int i = 0; i < cart.size(); i++){
            System.out.printf("%3d\t%-10s\t%-10.2f\n",i+1,cart.get(i).getItem(),cart.get(i).getPrice());
        }
        System.out.printf("Total Price: RM %.2f\n",cost);
    }
    public static void showCommand(String[][] commands){
        System.out.println("Commands:");
        for (int i = 0; i < commands.length; i++){
            System.out.printf("%s - %-20s\n",commands[i][0],commands[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CandyMachine a = new CandyMachine();
        a.displayItems();
        String[][] commands = {{"a","Add To Cart"},{"d","Show Available Items"},{"s","Show Cart Items & Price"},{"p","Pay/Check Out"},{"q","Quit Program"},{"?","Show Commands"}};
        showCommand(commands);
        System.out.println();
        System.out.print("Function: ");
        char function = sc.next().charAt(0);
        char checkOut = 'n';
        while (function != 'q'){
            switch (function){
                case 'a'://addtocart
                    System.out.print("Option: ");
                    int select = sc.nextInt();
                    while (select < 0 || select >= a.dispensers.length){
                        System.out.println("Invalid choice! Please try again.");
                        System.out.print("Option: ");
                        select = sc.nextInt();
                    }
                    System.out.print("Quantity: ");
                    int quantity = sc.nextInt();
                    while (quantity < 0 || quantity > a.dispensers[select].getStock()){
                        System.out.println("Invalid quantity! Please try again.");
                        System.out.print("Quantity: ");
                        quantity = sc.nextInt();
                    }
                    a.addCart(select,quantity);
                    break;
                case 'd'://displayitems
                    a.displayItems();
                    break;
                case 's'://showprice
                    a.showPrice();
                    break;
                case 'p'://pay
                    System.out.print("Enter amount(RM): ");
                    double amount = sc.nextDouble();
                    while (amount < 0.00){
                        System.out.println("Invalid amount! Please try again.");
                        amount = sc.nextDouble();
                    }
                    a.cashRegister.topUp(amount);
                    while (a.cashRegister.getBalance() < a.cost){
                        System.out.printf("Short of RM %.2f! Please top up more.\n",a.cost - a.cashRegister.getBalance());
                        System.out.print("Enter amount(RM): ");
                        amount = sc.nextDouble();
                        a.cashRegister.topUp(amount);
                    }
                    System.out.printf("The change would be RM %.2f.\n",a.cashRegister.getBalance() - a.cost);
                    System.out.print("Would you like to proceed to check-out? (y/n): ");
                    checkOut = sc.next().charAt(0);
                    while (checkOut != 'y' && checkOut != 'n'){
                        System.out.println("Invalid input! Please try again.");
                        System.out.print("Would you like to proceed to check-out? (y/n): ");
                        checkOut = sc.next().charAt(0);
                    }
                    break;
                case '?':
                    showCommand(commands);
                    break;
                default:
                    System.out.println("Invalid command! Please try again.");
                    break;
            }
            if (checkOut == 'y'){
                System.out.println("Transaction Successful!");
                System.out.printf("Your change: RM %.2f.\n",a.cashRegister.getBalance() - a.cost);
                //Output: return change
                //Output: release items
                System.out.println();
                System.out.println("Receipt of Transaction");
                a.showPrice();
                break;
            }
            System.out.println();
            System.out.print("Function: ");
            function = sc.next().charAt(0);
        }
        System.out.println("Thank you! Please come again.");
    }
}
