public class tester {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> myLinkedList = new DoublyLinkedList<>();

        myLinkedList.addFirst(1);
        myLinkedList.addLast(10);
        myLinkedList.add(2,2);
        myLinkedList.add(3,100);
        myLinkedList.remove(3);
        System.out.println();
        myLinkedList.iterateForward();
        myLinkedList.iterateBackward();
        myLinkedList.showSize();
        myLinkedList.clear();
        myLinkedList.showSize();
    }
}
