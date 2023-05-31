import java.util.Scanner;
public class L9bQ2 {
    public static int binomial(int n, int k) {
        if (k == n || k == 0)
            return 1;
        else {
            return binomial(n-1, k-1) + binomial(n-1, k);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the degree of your binomial expression: ");
        String strInput = input.nextLine();
        int n = Integer.parseInt(strInput);
        // Print binomial expansion
        System.out.print("(x+y)^" + n + " = ");
        for (int k = 0; k <= n; k++) {
            System.out.print(binomial(n,k) + "x^"+(n-k)+"y^"+k);
            if (k != n)
                System.out.print(" + ");
        }
        System.out.println();
    }
}
