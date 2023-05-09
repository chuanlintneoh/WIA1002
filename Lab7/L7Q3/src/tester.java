import java.util.Scanner;
public class tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String query;
        FIFOStockTransactionAnalyzer a = new FIFOStockTransactionAnalyzer();
        while (true) {
            System.out.print("Enter your query (In format 'Buy/Sell x shares at $y each'): ");
            query = sc.nextLine();
            if (query.equals("q")) {
                a.conclude();
                break;
            } else if (query.matches("Buy \\d+ shares at \\$\\d+ each")) {
                String[] values = query.replaceAll("\\D+", " ").trim().split(" ");
                int numShares = Integer.parseInt(values[0]);
                int price = Integer.parseInt(values[1]);
                a.buy(numShares, price);
            } else if (query.matches("Sell \\d+ shares at \\$\\d+ each")) {
                String[] values = query.replaceAll("\\D+", " ").trim().split(" ");
                int numShares = Integer.parseInt(values[0]);
                int price = Integer.parseInt(values[1]);
                a.sell(numShares, price);
            } else {
                System.out.println("Invalid input format! Please try again.");
            }
        }
    }
}
