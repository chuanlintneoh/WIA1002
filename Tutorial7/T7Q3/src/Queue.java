import java.util.LinkedList;
public class Queue<E> {
    private java.util.LinkedList<E> list = new LinkedList<>();
    public void enqueue(E e){
        list.addLast(e);
    }
    public E dequeue(){
        return list.removeFirst();
    }
    public int getSize(){
        return list.size();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    @Override
    public String toString(){
        return "Queue: " + list.toString();
    }
}