public class Main {
    public static double exponent(int x, int m){
        if (m == 0){
            return 1;
        }
        else if (m == 1){
            return x;
        }
        else if (m < 0){
            return 1/exponent(x,-m);
        }
        else {
            return x * exponent(x,m-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(exponent(10,3));
    }
}