public class doublyLinkedList<E> {
    private Node<E> head;
    private int size;
    public doublyLinkedList(){
        head = null;
        size = 0;
    }
    public E remove(int index){
        E element = null;
        if (index == 0){

        }
        else {
            Node<E> temp = head;
            for (int i = 0; i < index; i++){
                temp = temp.next;
            }
            element = temp.element;
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
            temp.prev = null;
            temp.next = null;
            size--;
        }
        return element;
        /*
        if index = 3, the method will remove the node at index 3.
        A temp node is assigned from the head and looped until the node of the index.
        The element of the node is stored inside the variable named element.
        Since a node is removed from the doubly linked list,
        The previous of the next node is updated to the previous of removed node.
        The next of the previous node is updated to the next of removed node.
        The previous and next node of removed node which is temp are set to null.
         */
    }
}
