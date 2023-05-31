public class Main {
    public static void printDigit(int n){
        if (n > 0){
            printDigit(n / 10);
            System.out.print(n % 10 + " ");
        }
    }
    public static void main(String[] args) {
        printDigit(4567);
    }
}