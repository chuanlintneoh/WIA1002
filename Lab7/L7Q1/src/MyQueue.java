import java.util.Collections;
import java.util.LinkedList;
public class MyQueue<E> {
    private final LinkedList<E> queue;
    public MyQueue(E[] e){
        this.queue = new LinkedList<>();
        if (e != null){
            Collections.addAll(queue, e);
        }
    }
    public MyQueue(){
        this(null);
    }
    public void enqueue(E e){
        queue.addLast(e);
    }
    public E dequeue(){
        return queue.removeFirst();
    }
    public E getElement(int i){
        return queue.get(i);
    }
    public E peek(){
        return queue.getFirst();
    }
    public int getSize(){
        return queue.size();
    }
    public boolean contains(E e){
        return queue.contains(e);
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    @Override
    public String toString(){
        return "Queue: " + queue.toString();
    }
}
