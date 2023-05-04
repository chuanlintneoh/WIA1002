import java.util.*;
public class TestIntMyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack<Integer> a = new MyStack<>();
        System.out.print("Enter an integer: ");
        int value = sc.nextInt();
        for (int i = 1; i <= value; i++){
            a.push(i);
        }
        System.out.println("Size of stack: " + a.getSize());
        System.out.println("Contents of stack by repeatedly calling pop():");
        while (!a.isEmpty()){
            System.out.print(a.pop() + " ");
        }
        System.out.println();
    }
}
