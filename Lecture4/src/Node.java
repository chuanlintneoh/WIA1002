public class Node <E>{
    E element;
    Node<E> next;
    public Node(E o){
        element = o;
    }
    public void addFirst(E e){
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail == null){
            tail = head;
        }
    }
    public void add(int index, E e){
        if (index == 0) addFirst(e);
        else if (index >= size) addLast(e);
        else {
            Node<E> current = head;
            for (int i = 1; i < index; i++){
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<>(e);
            (current.next).next = temp;
            size++;
        }
    }
    public E removeFirst(){
        if (size == 0) return null;
        else {
            Node<E> temp = head;
            head = head.next;
            size--;
            if (head == null) tail = null;
            return temp.element;
        }
    }
    public E removeLast(){
        if (size == 0) return null;
        else if (size == 1){
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        }
        else {
            Node<E> current = head;
            for (int i = 0; i < size - 2; i++){
                current = current.next;
            }
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }
    public E remove (int index){
        if (index < 0 || index >= size) return null;
        else if (index == 0) return removeFirst();
        else if (index == size - 1) return removeLast();
        else {
            Node<E> previous = head;
            for (int i = 1; i < index; i++){
                previous = previous.next;
            }
            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }
    public static void main(String[] args) {
        Node<String> head = null;
        Node<String> tail = null;

        head = new Node<>("Chicago");
        tail = head;

        tail.next = new Node<>("Denver");
        tail = tail.next;

        tail.next = new Node<>("Dallas");
        tail = tail.next;

        Node<String> current = head;
        while (current!= null){
            System.out.println(current.element);
            current = current.next;
        }
    }
}
