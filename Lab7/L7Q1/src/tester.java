public class tester {
    public static void main(String[] args) {
        MyQueue<String> fruitQ = new MyQueue<>(new String[]{"Durian", "Blueberry"});
        String[] fruits = {"Apple", "Orange", "Grapes", "Cherry"};
        for (String fruit: fruits){
            fruitQ.enqueue(fruit);
        }
        System.out.println(fruitQ);
        System.out.println("Top item: " + fruitQ.peek());
        System.out.println("Queue size: " + fruitQ.getSize());
        delete(fruitQ,"Durian");
        System.out.println("Item in index position 2: " + fruitQ.getElement(2));
        System.out.println("Queue consists of Cherry: " + fruitQ.contains("Cherry"));
        System.out.println("Queue consists of Durian: " + fruitQ.contains("Durian"));
        System.out.println("Displaying queue using isEmpty()...");
        while (!fruitQ.isEmpty()){
            System.out.print(fruitQ.dequeue() + " ");
        }
    }
    public static void delete(MyQueue<String> queue, String e){
        if (queue.contains(e)){
            MyQueue<String> temp = new MyQueue<>();
            while (!queue.isEmpty()){
                if (queue.peek().equals(e)){
                    queue.dequeue();
                }
                else {
                    temp.enqueue(queue.dequeue());
                }
            }
            System.out.printf("Removed %s from queue.\n",e);
            while (!temp.isEmpty()){
                queue.enqueue(temp.dequeue());
            }
        }
        else {
            System.out.printf("%s does not exist in the queue!\n",e);
        }
    }
}
