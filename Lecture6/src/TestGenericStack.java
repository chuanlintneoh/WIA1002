public class TestGenericStack {
    public static void main(String[] args) {
        //Create a stack
        GenericStack<String> stack = new GenericStack<>();
        //Add elements to the stack
        stack.push("Tom");
        System.out.println("(1) " + stack);
        stack.push("Susan");
        System.out.println("(2) " + stack);
        stack.push("Kim");
        stack.push("Michael");
        //Remove elements from the stack
        System.out.println("(3) " + stack);
        System.out.println("(4) " + stack.pop());
        System.out.println("(5) " + stack.pop());
        System.out.println("(6) " + stack);
    }
}
