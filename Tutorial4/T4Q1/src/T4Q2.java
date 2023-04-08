public class T4Q2 {
    public static boolean contains(Character e){
        Node<Character> pointerB = tester.head;
        while (pointerB != null){
            if (pointerB.element == e){
                System.out.println(pointerB.element);
                return true;
            }
            pointerB = pointerB.next;
        }
        return false;
    }
}
