public class tester {
    public static void main(String[] args) {
        MyStack<Integer> S = new MyStack<>();
        Integer[] integers = {2,2,0,0,4,8,0,8};
        for (Integer integer: integers){
            S.push(integer);
        }
        System.out.println(S);
        System.out.println("Sum of every element in S: " + sum(S));
    }
    public static int sum(MyStack<Integer> o){
        int sum = 0;
        MyStack<Integer> duplicate = new MyStack<>();
        while (!o.isEmpty()){
            Integer element = o.pop();
            sum += element;
            duplicate.push(element);
        }
        while (!duplicate.isEmpty()){
            o.push(duplicate.pop());
        }
        return sum;
    }
}
