public class SNode<E> {
    E element;
    SNode<E> prev;
    SNode<E> next;
    public SNode(){
        this(null);
    }
    public SNode(E element){
        this.element = element;
    }
}
