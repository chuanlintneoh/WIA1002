import java.util.Scanner;
public class ReversePrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        reverse(number);
    }
    public static void reverse(int number){
        if (number > 0){
            System.out.print(number%10);
            reverse(number/10);
        }
    }
}
