public class Main {
    public static int summation(int n){
        if (n == 1){
            return n;
        }
        else {
            return n + summation(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(summation(5));
    }
}