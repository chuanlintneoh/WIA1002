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
    public void clear(){
        list.clear();
    }
    public boolean contains(E e){
        return list.contains(e);
    }
    public int getIndexOf(E e){
        return list.indexOf(e);
    }
}