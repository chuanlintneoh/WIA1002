public class Node<E> {
    E element;
    Node<E> prev;
    Node<E> next;
    public Node(){
        this(null,null,null);
    }
    public Node(E element){
        this(element,null,null);
    }
    public Node(E element, Node<E> prev, Node<E> next){
        this.element = element;
        this.prev = prev;
        this.next = next;
    }
}
