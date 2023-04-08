public class tester {
    static Node<Character> head;
    static Node<Character> tail;
    public static void main(String[] args) {
        Node<Character> node1 = new Node<>('a');
        Node<Character> node2 = new Node<>('z');
        head = node1;//head point to node1
        tail = node2;//tail point to node2

        node1.next = node2;//node1 accessing node2

        Node<Character> firstNode = new Node<>('b');//create firstNode
        firstNode.next = head;//replace the next node of firstNode to existing head
        head = firstNode;//replace head with new firstNode

        displayList();
        addLast('c');
        add(0,'d');
        removeFirst();
        removeLast();
        remove(1);

        System.out.println(T4Q2.contains('a'));
        System.out.println(T4Q2.contains('b'));
        System.out.println(T4Q2.contains('z'));

        System.out.println(T4Q3.remove(0));
        displayList();
    }
    public static void addLast(Character e){
        Node<Character> newNode = new Node<>(e);//create newNode
        if (head == null){
            head = newNode;
            tail = head;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        displayList();
    }//addLast() – value of element, c
    public static void add(int index, Character e){
        Node<Character> newNode = new Node<>(e);//create newNode
        if (index == 0){
            newNode.next = head;
            head = newNode;
        }
        else {
            Node<Character> search = head;//create search element and start from head
            for (int i = 0; i < index - 1; i++){
                search = search.next;
            }
            if (search.next == null){
                tail = newNode;
            }
            newNode.next = search.next;
            search.next = newNode;
        }
        displayList();
    }//add(int index, E e) – value of element, d
    public static void removeFirst(){
        if (head == null){
            return;
        }
        if (tail == head){
            head = null;
            tail = null;
        }
        else {
            head = head.next;
        }
        displayList();
    }//removeFirst()
    public static void removeLast(){
        if (tail == null){
            return;
        }
        if (head == tail){
            head = null;
            tail = null;
        }
        else {
            Node<Character> search = head;//create search element and start from head
            while (search.next != tail){
                search = search.next;
            }
            tail = search;
            search.next = null;
        }
        displayList();
    }//removeLast()
    public static void remove(int index){
        if (index == 0){
            removeFirst();
            return;
        }
        Node<Character> search = head;//create search element and start from head
        for (int i = 0; i < index - 1; i++){
            search = search.next;
        }
        search.next = search.next.next;
        if (search.next == null){
            tail = search;
        }
        displayList();
    }//remove(int index) – remove at index 1
    public static void displayList(){
        Node<Character> display = head;//create display element and start from head
        System.out.printf("Head: %s\n",head == null? "null":head.element);
        System.out.printf("Head (next): %s\n",head != null && head.next != null? head.next.element : "null");
        System.out.printf("Tail: %s\n",tail == null? "null":tail.element);
        System.out.printf("Tail (next): %s\n",tail != null && tail.next != null? tail.next.element : "null");
        while (display != null){
            System.out.print(display.element + " ");
            display = display.next;
        }
        System.out.println();
        System.out.println();
    }
}
