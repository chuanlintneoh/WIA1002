public class Node<E> {
    E element;
    Node<E> next;
    public Node(){
        this.element = null;
        this.next = null;
    }
    public Node(E element) {
        this.element = element;
        this.next = null;
    }
}