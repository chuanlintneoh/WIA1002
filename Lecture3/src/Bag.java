import java.util.ArrayList;
public class Bag<T> implements BagInterface<T>{
    private ArrayList<T> entries = new ArrayList<>();
    @Override
    public int getCurrentSize() {
        return entries.size();
    }
    @Override
    public boolean isEmpty() {
        if (entries.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public boolean add(T newEntry) {
        entries.add(newEntry);
        return true;
    }
    @Override
    public T remove() {
        if (entries.isEmpty()) {
            return null;
        } else {
            return entries.remove(entries.size() - 1);
        }
    }
    @Override
    public boolean remove(T anEntry) {
        if (entries.contains(anEntry)){
            entries.remove(anEntry);
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public void clear() {
        entries.clear();
    }
    @Override
    public int getFrequencyOf(T anEntry) {
        int frequency = 0;
        for (T element: entries){
            if (element.equals(anEntry)){
                frequency++;
            }
        }
        //for (int i = 0; i < entries.size(); i++){
        //    if (entries.get(i).equals(anEntry)){
        //        frequency++;
        //    }
        //}
        return frequency;
    }
    @Override
    public boolean contains(T anEntry) {
        if (entries.contains(anEntry)){
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public T[] toArray() {
        Object[] arr = new Object[entries.size()];
        for (int i = 0; i < entries.size(); i++){
            arr[i] = entries.get(i);
        }
        return (T[]) arr;
    }
}