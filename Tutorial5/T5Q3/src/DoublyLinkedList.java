public class DoublyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;
    public DoublyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    public void add(int index, E element){
        if (index < 0 || index > size){
            System.out.println("Index out of bounds!");
            return;
        }
        Node<E> newNode = new Node<>(element);
        if (head == null){
            head = newNode;
            tail = head;
            size++;
            return;
        }
        if (index == 0){
            Node<E> temp = head;
            head = newNode;
            head.next = temp;
            temp.prev = head;
            if (tail == null){
                tail = head;
            }
        }
        else {
            Node<E> cursor = head;
            for (int i = 1; i < index; i++){
                cursor = cursor.next;
            }
            newNode.prev = cursor;
            newNode.next = cursor.next;
            if (tail != cursor){
                cursor.next.prev = newNode;
            }
            cursor.next = newNode;
            if (index == size){
                tail = newNode;
            }
        }
        size++;
    }
    public void display(){
        Node<E> cursor = head;
        while (cursor != null){
            System.out.println(cursor.element + " ");
            cursor = cursor.next;
        }
        System.out.println();
    }
    public void reverseDisplay(){
        Node<E> cursor = tail;
        while (cursor != null){
            System.out.println(cursor.element + " ");
            cursor = cursor.prev;
        }
        System.out.println();
    }
}
