public class tester {
    public static void main(String[] args) {
        DoublyLinkedList<Character> a = new DoublyLinkedList<>();
        a.add(0,'a');
        a.add(1,'b');
        a.add(2,'c');
        a.add(3,'z');
        a.display();
        a.reverseDisplay();
    }
}
