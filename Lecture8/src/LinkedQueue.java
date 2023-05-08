import java.util.*;
public class LinkedQueue<E> implements QueueInterface<E>{
    private LinkedList<E> queue = new LinkedList<>();
    public void enqueue(E e){
        queue.addLast(e);
    }
    public E dequeue(){
        return queue.removeFirst();
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    public void clear(){
        queue.clear();
    }
}
