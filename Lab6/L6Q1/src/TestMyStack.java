public class TestMyStack {
    public static void main(String[] args) {
        MyStack<Character> a = new MyStack<>();
        Character[] elements = {'a','b','c'};
        for (Character element: elements){
            a.push(element);
        }
        System.out.println(a.toString());
        System.out.println("Element 'b' is in stack: " + a.search('b'));
        System.out.println("Element 'k' is in stack: " + a.search('k'));
        System.out.println();

        MyStack<Integer> b = new MyStack<>();
        Integer[] integers = {1,2,3};
        for (Integer integer: integers){
            b.push(integer);
        }
        System.out.println(b.toString());
        System.out.println("Element 6 is in stack: " + b.search(6));
    }
}
