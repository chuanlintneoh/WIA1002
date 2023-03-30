public class StorePairGeneric<E extends Comparable<E>> implements Comparable<StorePairGeneric<E>> {
    //private int first, second;
    private E first, second;
    //public StorePairGeneric(int first, int second){
    public StorePairGeneric(E first, E second){
        this.first = first;
        this.second = second;
    }
    public E getFirst(){
        return first;
    }
    public E getSecond(){
        return second;
    }
    public void setPair (E first, E second){
        this.first = first;
        this.second = second;
    }
    //b) Override the Object equals() method in the StorePair class
    @Override
    public boolean equals(Object o) {
        StorePairGeneric<E> other = (StorePairGeneric<E>) o;
        return this.first.equals(other.first);
    }
    //c) Have the StorePair class implement the Comparable interface. Override the compareTo()method to compare the first values of two objects.
    @Override
    public int compareTo(StorePairGeneric<E> o) {
        return this.first.compareTo(o.first);
    }
    @Override
    public String toString(){
        return "first = " + first + ", second = " + second;
    }
    public static void main(String[] args) {
    //d) Create a test program that creates three objects of the StorePairGeneric class
        StorePairGeneric<Integer> a = new StorePairGeneric<>(6,4);
        StorePairGeneric<Integer> b = new StorePairGeneric<>(2,2);
        StorePairGeneric<Integer> c = new StorePairGeneric<>(6,3);
    //e) Invoke the compareTo() and equals() methods that compares the first value of three objects
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a.compareTo(b)); //a > b, it returns a positive number (1)
        System.out.println(a.compareTo(c)); //a == c, it returns 0
        System.out.println(b.compareTo(c)); //b < c, it returns a negative number (-1)
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(b.equals(c));
    }
}