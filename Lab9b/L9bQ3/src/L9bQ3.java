import java.util.Scanner;
public class L9bQ3 {
    public static int TOH(int n) {
        if (n == 1)
            return 1;
        else
            return 2 * TOH(n-1) + 1;
    }
    public static void main(String[] args) {
        System.out.println("Part a: The recurrence relation is T(n) = 2 x T(n-1) + 1.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of discs: ");
        String strInput = input.nextLine();
        int n = Integer.parseInt(strInput);
        System.out.println("The number of steps needed to move "
                + n + " discs is " + TOH(n));
    }
}
