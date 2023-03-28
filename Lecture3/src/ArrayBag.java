public class ArrayBag<T> implements SetInterface<T>{
    private final T[] bag;
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 25;
    public ArrayBag(){
        this(DEFAULT_CAPACITY);
    }
    public ArrayBag(int capacity){
        @SuppressWarnings("unchecked")
        T[] tempBag = (T[]) new Object[capacity];
        bag = tempBag;
        numberOfEntries = 0;
    }
    public boolean add(T newEntry){
        return false;
    }
    public T[] toArray(){

    }
    private boolean isArrayFull(){

    }
    @Override
    public int getCurrentSize(){

    }
    public boolean isEmpty(){

    }
    public boolean remove(T anEntry){

    }
    public T remove(){

    }
    public void clear(){

    }
    public boolean contains(T anEntry){

    }
}
