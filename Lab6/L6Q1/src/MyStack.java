import java.util.*;
public class MyStack<E> {
    ArrayList<E> stack;
    public MyStack(){
        stack = new ArrayList<>();
    }
    public void push(E o){
        stack.add(o);
    }
    public E pop(){
        E element = peek();
        stack.remove(stack.size() - 1);
        return element;
    }
    public E peek(){
        return stack.get(stack.size() - 1);
    }
    public int getSize(){
        return stack.size();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public String toString(){
        return stack.toString();
    }
    public boolean search(E o){
        return stack.contains(o);
    }
}
