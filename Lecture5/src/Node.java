public class Node<E> {
    Node<E> prev;
    E element;
    Node<E> next;
    public Node (E element, Node<E> prev, Node<E> next){
        this.element = element;
        this.prev = prev;
        this.next = next;
    }
    public Node (E element){
        this(element,null,null);
    }
}
