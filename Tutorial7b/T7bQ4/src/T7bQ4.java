import java.util.PriorityQueue;
public class T7bQ4 {
    public static void main(String[] args) {
        PriorityQueueComparator pqc = new PriorityQueueComparator();
        PriorityQueue<String> pq = new PriorityQueue<>(5,pqc);
        pq.add("Jason");
        pq.add("Ali");
        pq.add("Muhamad");
        System.out.println(pq);
        for (String s: pq){
            System.out.println(s);
        }
    }
}
