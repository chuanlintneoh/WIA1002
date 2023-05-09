public class tester {
    public static void main(String[] args) {
        Queue<Integer> X = new Queue<>();
        X.enqueue(new Integer(14));
        X.enqueue(new Integer(3));
        X.enqueue(new Integer(5));
        Object Y = X.dequeue();
        X.enqueue(new Integer(7));
        X.enqueue(new Integer(9));
        Y = X.dequeue();
        X.enqueue(new Integer(2));
        X.enqueue(new Integer(4));

        System.out.println(X.front());

        Y = X.dequeue();
        System.out.println(Y);
        X.enqueue(new Integer(10));
        System.out.println(X.front());

        Y = X.dequeue();
        System.out.println(Y);

        System.out.println(X.front());
    }
}
