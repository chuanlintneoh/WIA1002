import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    private TreeNode<E> root;
    private int size = 0;
    public BST(){
        root = null;
        size = 0;
    }
    public BST(E[] objects){
        for (E object: objects){
            insert(object);
        }
    }
    @Override
    public boolean search(E element) {
        TreeNode<E> current = root;// Start from the root
        while (current != null){
            if (element.compareTo(current.element) < 0){
                current = current.left;// Go left
            }
            else if (element.compareTo(current.element) > 0){
                current = current.right;// Go right
            }
            else return true;// Element matches current.element
        }
        return false;// Element not in the tree
    }
    @Override
    public boolean insert(E element) {
        if (root == null){
            root = new TreeNode<>(element);
        }
        else {
            TreeNode<E> current = root;// Locate the parent node
            TreeNode<E> parent = null;
            while (current != null){
                if (element.compareTo(current.element) < 0){
                    parent = current;
                    current = current.left;
                }
                else if (element.compareTo(current.element) > 0){
                    parent = current;
                    current = current.right;
                }
                else return false;// Duplicate node not inserted
            }
            // Create the new node and attach it to the parent node
            if (element.compareTo(parent.element) < 0){
                parent.left = new TreeNode<>(element);
            }
            else {
                parent.right = new TreeNode<>(element);
            }
        }
        size++;
        return true;
    }
    @Override
    public boolean delete(E element) {
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        while (current != null){
            if (element.compareTo(current.element) < 0){
                parent = current;
                current = current.left;
            }
            else if (element.compareTo(current.element) > 0){
                parent = current;
                current = current.right;
            }
            else break; // Element is in the tree pointed at by current
        }
        if (current == null){
            return false;// Element is not in tree
        }
        // Case 1: current has no left child
        if (current.left == null) {
            // Connect the parent with the right child of the current node
            if (parent == null) {
                root = current.right;
            }
            else {
                if (element.compareTo(parent.element) < 0)
                    parent.left = current.right;
                else
                    parent.right = current.right;
            }
        }
        else {
            // Case 2: The current node has a left child
            // Locate the rightmost node in the left subtree of
            // the current node and also its parent
            TreeNode<E> parentOfRightMost = current;
            TreeNode<E> rightMost = current.left;
            while (rightMost.right != null) {
                parentOfRightMost = rightMost;
                rightMost = rightMost.right; // Keep going to the right
            }
            // Replace the element in current by the element in rightMost
            current.element = rightMost.element;
            // Eliminate rightmost node
            if (parentOfRightMost.right == rightMost)
                parentOfRightMost.right = rightMost.left;
            else
                // Special case: parentOfRightMost == current
                parentOfRightMost.left = rightMost.left;
        }
        size--;
        return true; // Element deleted successfully
    }
    @Override
    public Iterator<E> iterator(){
        return new InorderIterator();
    }
    @Override
    public void inorder() {
        inorder(root);
    }
    public void inorder(TreeNode<E> root){
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.element + " ");
        inorder(root.right);
    }
    @Override
    public void preorder() {
        preorder(root);
    }
    public void preorder(TreeNode<E> root){
        if (root == null) return;
        System.out.print(root.element + " ");
        preorder(root.left);
        preorder(root.right);
    }
    @Override
    public void postorder() {
        postorder(root);
    }
    public void postorder(TreeNode<E> root){
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element + " ");
    }
    public List<TreeNode<E>> path(E element){
        ArrayList<TreeNode<E>> list = new ArrayList<>();
        TreeNode<E> current = root;
        while (current != null) {
            list.add(current); // Add the node to the list
            if (element.compareTo(current.element) < 0) {
                current = current.left;
            }
            else if (element.compareTo(current.element) > 0) {
                current = current.right;
            }
            else break;
        }
        return list; // Return an array list of nodes
    }
    private class InorderIterator implements Iterator<E>{
        private ArrayList<E> list = new ArrayList<>();
        private int current = 0;
        public InorderIterator(){
            inorder();
        }
        private void inorder(){
            inorder(root);
        }
        private void inorder(TreeNode<E> root){
            if (root == null) return;
            inorder(root.left);
            list.add(root.element);
            inorder(root.right);
        }
        @Override
        public boolean hasNext() {
            return current < list.size();
        }
        @Override
        public E next() {
            return list.get(current++);
        }
        @Override
        public void remove() {
            delete(list.get(current)); // Delete the current element
            list.clear(); // Clear the list
            inorder(); // Rebuild the list
        }
    }
    @Override
    public int getSize() {
        return size;
    }
    @Override
    public void clear() {
        root = null;
        size = 0;
    }
}
