public class MyLinkedList<E> {
    Node<E> head;
    Node<E> tail;
    public MyLinkedList(){
        head = null;
        tail = null;
    }
    public void addFirst(E e){
        add(0,e);
    }
    public void addLast(E e){
        add(getListLength(),e);
    }
    public void add(int index, E e){
        if (index < 0 || index > getListLength()){
            return;
        }
        Node<E> newNode = new Node<>(e);
        if (head == null){
            head = newNode;
            tail = head;
            return;
        }//empty list
        if (index == 0){
            newNode.next = head;
            head = newNode;
        }
        else {
            Node<E> pointer = head;
            for (int i = 0; i < index - 1; i++){
                pointer = pointer.next;
            }
            if (pointer.next == null){
                tail = newNode;
            }
            newNode.next = pointer.next;
            pointer.next = newNode;
        }
    }
    public E removeFirst(){
        return remove(0);
    }
    public E removeLast(){
        return remove(getListLength()-1);
    }
    public E remove(int index){
        if (index < 0 || index > getListLength()-1 || head == null){
            return null;
        }
        E element;
        if (index == 0){
            element = head.element;
            if (head == tail){
                head = null;
                tail = null;
            }
            else {
                head = head.next;
            }
        }
        else {
            Node<E> pointer = head;
            for (int i = 0; i < index - 1; i++){
                pointer = pointer.next;
            }
            element = pointer.next.element;
            pointer.next = pointer.next.next;
            if (pointer.next == null){
                tail = pointer;
            }
        }
        return element;
    }
    public boolean contains(E e){
        Node<E> pointer = head;
        while (pointer != null){
            if (pointer.equals(e)){
                return true;
            }
            pointer = pointer.next;
        }
        return false;
    }//Return true if list contains the element e
    public E get(int index){
        if (index < 0 || index > getListLength()-1 || head == null){
            return null;
        }
        Node<E> pointer = head;
        for (int i = 0; i < index; i++){
            pointer = pointer.next;
        }
        if (pointer.element == null){
            return null;
        }
        else {
            return pointer.element;
        }
    }//Return element at the specified index
    public E getFirst(){
        return get(0);
    }//Return the value of the first item
    public E getLast(){
        return get(getListLength()-1);
    }//Return the value of the last item
    private int getListLength(){
        int count = 0;
        Node<E> pointer = head;
        while (pointer != null){
            pointer = pointer.next;
            count++;
        }
        return count;
    }
    public int indexOf(E e){
        int index = 0;
        Node<E> pointer = head;
        while (pointer != null){
            if (pointer.element.equals(e)){
                return index;
            }
            index++;
            pointer = pointer.next;
        }
        return -1;
    }//Return the index of the head matching element in this list. Return -1 of no match
    public int lastIndexOf(E e){
        boolean found = false;
        int index = 0;
        int record = -1;
        Node<E> pointer = head;
        while (pointer != null){
            if (pointer.element.equals(e)){
                found = true;
                record = index;
            }
            index++;
            pointer = pointer.next;
        }
        if (!found){
            return -1;
        }
        else {
            return record;
        }
    }//Return the index of the last matching element in this list. Return -1 of no match
    public E set(int index, E e){
        if (index < 0 || index > getListLength()){
            return null;
        }
        E element = remove(index);
        add(index,e);
        return element;
    }//Replace the element at the specified position in this list with the specified element
    public void clear(){
        Node<E> pointer = head;
        while (pointer != null){
            System.out.print(removeFirst() + " ");
            pointer = pointer.next;
        }
        System.out.println();
    }//Clear the list
    public void print(){
        Node<E> scan = head;
        while (scan != null){
            System.out.print(scan.element + " ");
            scan = scan.next;
        }
        System.out.println();
    }//Print all the elements in the list
    public void reverse(){
        if (head == null && tail == null){
            print();
            return;
        }
        MyLinkedList<E> tempList = new MyLinkedList<>();
        int j = 0;
        for (int i = getListLength() - 1; i >= 0; i--){
            tempList.add(j,get(i));
            j++;
        }
        Node<E> pointer = tempList.head;
        int i = 0;
        while (pointer != null){
            set(i,pointer.element);
            pointer = pointer.next;
            i++;
        }
        print();
    }//Print all elements in reverse order
    public E getMiddleValue(){
        if (getListLength() == 0){
            return null;
        }
        int index;
        if (getListLength() % 2 == 0){
            index = getListLength()/2 - 1;
        }
        else {
            index = getListLength()/2;
        }
        return get(index);
    }//returns the value of the middle element
}
