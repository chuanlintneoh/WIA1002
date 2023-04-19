public class SList<E> {
    private SNode<E> head;
    private SNode<E> tail;
    public SList(){
        head = null;
        tail = null;
    }
    public void appendEnd(E e){
        SNode<E> newNode = new SNode<>(e);
        newNode.prev = tail;
        if (tail != null){
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null){
            head = newNode;
        }
    }//Append a new element at the end of the list
    public E removeInitial(){
        if (head == null){
            return null;
        }
        SNode<E> temp = head;
        head = head.next;
        head.prev = null;
        return temp.element;
    }//Eliminate the first element of the list
    public boolean contains(E e){
        SNode<E> cursor = head;
        while (cursor != null){
            if (cursor.element.equals(e)){
                return true;
            }
            cursor = cursor.next;
        }
        return false;
    }//Search for an element and returns true if this list contains the searched element
    public void clear(){
        SNode<E> cursor = head;
    }//Empty all elements in the list and return a statement that reports that the list is empty
    public void display(){
        SNode<E> cursor = head;
        while (cursor != null){
            System.out.print(cursor.element + " ");
            cursor = cursor.next;
        }
        System.out.println();
    }//Displays all values from a list in a successive order
}
