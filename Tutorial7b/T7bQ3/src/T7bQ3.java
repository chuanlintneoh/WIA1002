import java.util.*;
public class T7bQ3 {
    public static void main(String[] args) {
        PriorityQueue<String> pQueue = new PriorityQueue<>();

        pQueue.offer("C++");
        pQueue.offer("Python");
        pQueue.offer("Java");
        pQueue.offer("Fortran");

        System.out.println("peek() gives us: " + pQueue.peek());

        System.out.println("The queue elements: ");
        Iterator itr = pQueue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        pQueue.poll();
        System.out.println("After poll():");
        Iterator<String> itr2 = pQueue.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }

        pQueue.remove("Java");
        System.out.println("After remove():");
        Iterator<String> itr3 = pQueue.iterator();
        while (itr3.hasNext()){
            System.out.println(itr3.next());
        }

        boolean b = pQueue.contains("Ruby");
        System.out.println("Priority Queue contains Ruby or not?: "+ b);

        Object[] arr = pQueue.toArray();
        System.out.println("Value in array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.println("Value: " + arr[i].toString());
        }
    }
}
