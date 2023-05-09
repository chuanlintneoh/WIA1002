import java.util.*;
public class tester {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<Integer>();
        Scanner keyIn = new Scanner(System.in);
        for (int i = 1; i <= 5; i++){
            if (keyIn.nextBoolean()){
                System.out.println(i);
            }
            else {
                q.enqueue(i);
            }
        }
        System.out.println("Dequeue:");
        while (!q.isEmpty()){
            System.out.print(q.dequeue() + " ");
        }
        System.out.println();
    }
}
