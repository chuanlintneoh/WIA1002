public class T4Q3 {
    public static Character remove(int index){
        if (tester.head == null || index < 0){
            return null;
        }
        Character temp;
        if (index == 0){
            temp = tester.head.element;
            if (tester.head == tester.tail){
                tester.head = null;
                tester.tail = null;
            }
            else {
                tester.head = tester.head.next;
            }
        }
        else {
            Node<Character> pointer1 = tester.head;
            for (int i = 0; i < index - 1; i++){
                pointer1 = pointer1.next;
            }
            temp = pointer1.next.element;
            pointer1.next = pointer1.next.next;
            if (pointer1.next == null){
                tester.tail = pointer1;
            }
        }
        return temp;
    }
}
