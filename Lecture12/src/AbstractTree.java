public abstract class AbstractTree<E> implements Tree<E>{
    @Override
    public boolean isEmpty(){
        return getSize() == 0;
    }
}
