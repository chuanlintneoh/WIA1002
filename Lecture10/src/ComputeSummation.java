import java.util.Scanner;
public class ComputeSummation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative number: ");
        int n = input.nextInt();

        System.out.println("Summation of " + n + " is " + summation(n));
    }
    public static long summation(int n){
        if (n == 0){
            return n;
        }
        else {
            return n + summation(n-1);
        }
    }
}
