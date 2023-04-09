public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Character> list = new MyLinkedList<>();

        list.addFirst('a');
        list.addLast('e');
        list.add(1,'b');
        list.add(2,'c');
        list.add(3,'d');
        //Append the following : a, b, c, d, e
        list.print();
        //Print all the elements in the list.
        list.reverse();
        //Reverse all the elements in the list.
        int i = 0;
        while (list.get(i) != null){
            i++;
        }
        System.out.println("Number of elements: " + i);
        //Retrieve the number of elements in the list.
        System.out.println("First value: " + list.getFirst());
        System.out.println("Last value: " + list.getLast());
        //Retrieve the first and last value.
        System.out.println("Removed: " + list.remove(2));
        list.print();
        //Delete the third value.
        System.out.printf("Index location of 'a': %2d | %2d\n",list.indexOf('a'),list.lastIndexOf('a'));
        System.out.printf("Index location of 'b': %2d | %2d\n",list.indexOf('b'),list.lastIndexOf('b'));
        System.out.printf("Index location of 'c': %2d | %2d\n",list.indexOf('c'),list.lastIndexOf('c'));
        System.out.printf("Index location of 'd': %2d | %2d\n",list.indexOf('d'),list.lastIndexOf('d'));
        System.out.printf("Index location of 'e': %2d | %2d\n",list.indexOf('e'),list.lastIndexOf('e'));
        //Retrieve the index location for the second and third value.
        System.out.println("Contains 'c': " + list.contains('c'));
        //Checks if the list has the value ‘c’.
        System.out.printf("Replaced %s with j.\n",list.set(0,'j'));
        System.out.printf("Replaced %s with a.\n",list.set(1,'a'));
        System.out.printf("Replaced %s with v.\n",list.set(2,'v'));
        System.out.printf("Replaced %s with a.\n",list.set(3,'a'));
        list.print();
        //Replace the items individually with the following: j,a,v,a.

        System.out.println("Middle value: " + list.getMiddleValue());
        //Retrieve the middle value.
    }
}
