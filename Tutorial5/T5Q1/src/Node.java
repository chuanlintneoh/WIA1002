public class Node<E> {
    E element;
    Node<E> next;
    public Node(){
        this(null,null);
    }
    public Node(E element,Node<E> next){
        this.element = element;
        this.next = next;
    }
}
