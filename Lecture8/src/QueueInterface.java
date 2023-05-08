public interface QueueInterface<E> {
    public void enqueue(E c);
    public E dequeue();
    public boolean isEmpty();
    public void clear();
}
