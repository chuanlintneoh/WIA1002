public class doublyLinkedList<E> {
    private Node<E> head;
    private int size;
    public doublyLinkedList(){
        head = null;
        size = 0;
    }
    public E xyz (int index, E e){
        Node<E> current = head;
        Node<E> temp;
        if (index < 0) return null;
        else if (index >= size - 1){
            this.addLast(e);
            return null;
        }
        //----line 10-----
        else if (index == 0){
            temp = head;
            head.element = e;
            return temp.element;
        }
        else {
            for (int i = 0; i < index; i++){
                current = current.next;
            }
            temp = current.next;
            current.next.element = e;
            return temp.element;
        }
        //----line 21-----
        /*
        if index = 0, the temp node will be assigned as the initial head node, then the element inside the head node will be updated as element e while the element inside the temp node will be returned.
        otherwise, a for loop is used to run through the linked list until the node just before the index, the temp node will be assigned as the node of the index to break the linked list, then the element of next node of current will be updated as element e while the element of temp is returned.
        xyz() is replace(), it replaces the element based on index in the parameter list with element e in the linked list and returns the element that is replaced out.
         */
    }
    public void addLast(E element){

    }
}
