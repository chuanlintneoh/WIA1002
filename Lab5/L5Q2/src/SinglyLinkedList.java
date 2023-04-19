public class SinglyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;
    public SinglyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    public void add(E e){
        Node<E> newNode = new Node<>(e);
        if (size == 0){
            head = newNode;
            tail = head;
        }
        else {
            Node<E> temp = head;
            while (temp != tail){
                temp = temp.next;
            }
            temp.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public void removeElement(E e){
        if (size == 0 || !contains(e)){
            return;
        }
        if (size == 1){
            head = null;
            tail = null;
        }
        else if (head.element.equals(e)){
            head = head.next;
        }
        else if (tail.element.equals(e)){
            Node<E> temp = head;
            while (temp.next != tail){
                temp = temp.next;
            }//temp = node before tail
            tail = temp;
            temp.next = null;
        }
        else {
            Node<E> temp = head;
            while (!(temp.next.element).equals(e)){
                temp = temp.next;
            }//temp = node before node with element e
            temp.next = temp.next.next;
        }
        size--;
    }
    public void printList(){
        Node<E> cursor = head;
        while (cursor != null){
            System.out.print(cursor.element);
            if (cursor != tail){
                System.out.print(", ");
            }
            else {
                System.out.print(".");
            }
            cursor = cursor.next;
        }
        System.out.println();
    }
    public int getSize(){
        return size;
    }
    public boolean contains(E e){
        Node<E> cursor = head;
        while (cursor != null){
            if (cursor.element.equals(e)){
                return true;
            }
            cursor = cursor.next;
        }
        return false;
    }
    public void replace(E e, E newE){
        if (size == 0 || !contains(e)){
            return;
        }
        if (size == 1){
            head.element = newE;
            tail = head;
        }
        else if (head.element.equals(e)){
            head.element = newE;
        }
        else if (tail.element.equals(e)){
            tail.element = newE;
        }
        else {
            Node<E> temp = head;
            while (!(temp.element).equals(e)){
                temp = temp.next;
            }//temp = node with element e
            temp.element = newE;
        }
    }
}
