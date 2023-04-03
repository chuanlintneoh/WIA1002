import java.util.*;
public class ArrayBag<T> implements BagInterface<T>{
    private T[] bag;
    private static final int DEFAULT_CAPACITY = 25;
    private int numberOfEntries;
    public ArrayBag(){
        this(DEFAULT_CAPACITY);
    }
    @SuppressWarnings("unchecked")
    public ArrayBag(int capacity){
        this.bag = (T[]) new Object[capacity];
        this.numberOfEntries = 0;
    }
    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }
    @Override
    public boolean isFull() {
        return numberOfEntries == bag.length;
    }
    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }
    @Override
    public boolean add(T newEntry) {
        if (isFull()){
            return false;
        }
        else {
            bag[numberOfEntries] = newEntry;
            numberOfEntries++;
            return true;
        }
    }
    @Override
    public T remove() {
        if (isEmpty()){
            return null;
        }
        else {
            T removed = bag[numberOfEntries-1];
            bag[numberOfEntries-1] = null;//remove last entry of bag
            numberOfEntries--;
            return removed;
        }
    }
    @Override
    public boolean remove(T anEntry) {
        if (!contains(anEntry)){
            return false;
        }
        else {
            int index = 0;
            for (T element: bag){
                if (element.equals(anEntry)){
                    break;
                }
                index++;
            }
            bag[index] = bag[numberOfEntries-1];//replace with last entry of bag
            bag[numberOfEntries-1] = null;//delete last entry of bag
            numberOfEntries--;
            return true;
        }
    }
    @Override
    public void clear() {
        while (!isEmpty()){
            remove();
        }
    }
    @Override
    public int getFrequencyOf(T anEntry) {
        int frequency = 0;
        for (T element: bag){
            if (element.equals(anEntry)){
                frequency++;
            }
        }
        return frequency;
    }
    @Override
    public boolean contains(T anEntry) {
        boolean contain = false;
        for (T element: bag){
            if (element.equals(anEntry)){
                contain = true;
                break;
            }
        }
        return contain;
    }
    @Override
    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] arr = (T[]) new Object[numberOfEntries];
        for (int i = 0; i < numberOfEntries; i++){
            arr[i] = bag[i];
        }
        return arr;
    }
    @Override
    public BagInterface<T> union(BagInterface<T> anotherBag){
        BagInterface<T> collection = new ArrayBag<T>(this.getCurrentSize() + anotherBag.getCurrentSize());
        for (T element: this.toArray()){
            collection.add(element);
        }
        for (T element: anotherBag.toArray()){
            collection.add(element);
        }
        return collection;
    }
    @Override
    public BagInterface<T> intersection(BagInterface<T> anotherBag){
        BagInterface<T> tempBag1 = new ArrayBag<>(this.getCurrentSize());
        for (T element: this.toArray()){
            tempBag1.add(element);
        }//duplicate bag1
        BagInterface<T> tempBag2 = new ArrayBag<>(anotherBag.getCurrentSize());
        for (T element: anotherBag.toArray()){
            tempBag2.add(element);
        }//duplicate bag2
        ArrayList<T> intersect = new ArrayList<>();
        for (T bag1: tempBag1.toArray()){
            for (T bag2: tempBag2.toArray()){
                if (bag1.equals(bag2)){
                    intersect.add(bag2);
                    tempBag1.remove(bag2);
                    tempBag2.remove(bag2);
                    break;
                }
            }
        }//compare and remove intersected items
        BagInterface<T> commonItems = new ArrayBag<>(intersect.size());
        for (int i = 0; i < intersect.size(); i++){
            commonItems.add(intersect.get(i));
        }
        return commonItems;
    }
    @Override
    public BagInterface<T> difference(BagInterface<T> anotherBag){
        BagInterface<T> tempBag1 = new ArrayBag<>(this.getCurrentSize());
        for (T element: this.toArray()){
            tempBag1.add(element);
        }//duplicate bag1
        BagInterface<T> tempBag2 = new ArrayBag<>(anotherBag.getCurrentSize());
        for (T element: anotherBag.toArray()){
            tempBag2.add(element);
        }//duplicate bag2
        for (T element: tempBag1.toArray()){
            for (T check: tempBag2.toArray()){
                if (element.equals(check)){
                    tempBag1.remove(check);
                    tempBag2.remove(check);
                    break;
                }
            }
        }//
        BagInterface<T> leftOver = new ArrayBag<>(tempBag1.toArray().length);
        for (int i = 0; i < tempBag1.toArray().length; i++){
            leftOver.add(tempBag1.toArray()[i]);
        }
        return leftOver;
    }
}
