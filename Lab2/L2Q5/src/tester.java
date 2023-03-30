public class tester {
    public static void main(String[] args) {
        Integer[] a = {1,2,3};
        String[] b = {"red","green","blue"};
        Circle[] c = {new Circle(3), new Circle(2.9), new Circle(5.9)};
        System.out.println(FindMax.max(a));
        System.out.println(FindMax.max(b));
        System.out.println(FindMax.max(c));
    }
}
