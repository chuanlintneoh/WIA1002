import java.util.*;
public class DoublyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;
    public DoublyLinkedList(){
        size = 0;
        this.head = null;
        this.tail = null;
    }
    public void addFirst(E element){
        Node<E> temp = new Node(element,head,null);
        if (head != null){
            head.prev = temp;
        }
        head = temp;
        if (tail == null){
            tail = temp;
        }
        size++;
        System.out.println("adding: " + element);
    }
    public void addLast(E element){
        Node<E> temp = new Node(element,null,tail);
        if (tail != null){
            tail.next = temp;
        }
        tail = temp;
        if (head == null){
            head = temp;
        }
        size++;
        System.out.println("adding: " + element);
    }
    public void add(int index, E element){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
        if (index == 0){
            addFirst(element);
        }
        else if (index == size){
            addLast(element);
        }
        else {
            Node<E> temp = head;
            for (int i = 0; i < index; i++){
                temp = temp.next;
            }
            Node<E> insert = new Node(element,temp,temp.prev);
            temp.prev.next = insert;
            temp.prev = insert;
            size++;
        }
    }
    public void iterateForward(){
        System.out.println("iterating forward...");
        Node<E> temp = head;
        while (temp != null){
            System.out.print(temp.element);
            System.out.print(" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void iterateBackward(){
        System.out.println("iterating backward...");
        Node<E> temp = tail;
        while (temp != null){
            System.out.print(temp.element);
            System.out.print(" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public E removeFirst(){
        if (size == 0){
            throw new NoSuchElementException();
        }
        Node<E> temp = head;
        head = head.next;
        head.prev = null;
        size--;
        System.out.println("deleted: " + temp.element);
        return temp.element;
    }
    public E removeLast(){
        if (size == 0){
            throw new NoSuchElementException();
        }
        Node<E> temp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        System.out.println("deleted: " + temp.element);
        return temp.element;
    }
    public E remove(int index){
        E element = null;
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        if (index == 0){
            element = removeFirst();
        }
        else if (index == size-1){
            element = removeLast();
        }
        else {
            Node<E> temp = head;
            for (int i = 0; i < index; i++){
                temp = temp.next;
            }
            element = temp.element;
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
            temp.next = null;
            temp.prev = null;
            size--;
        }
        return element;
    }
    public void clear(){
        int n = size;
        Node<E> temp = head;
        while (head != null){
            temp = head.next;
            head.prev = head.next = null;
            head = temp;
        }
        temp = null;
        tail.prev = tail.next = null;
        size = 0;
        System.out.printf("successfully clear %s node(s)\n",n);
    }
    public void showSize(){
        System.out.println("size of current Doubly Linked List: " + size);
    }
}