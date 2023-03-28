public class MyArray {
    public static <T> void listAll(T[] t){
        for (T element: t){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArr = {1,2,3,4,5};
        String[] stringArr = {"Jane","Tom","Bob"};
        Character[] charArr = {'a','b','c'};

        listAll(intArr);
        listAll(stringArr);
        listAll(charArr);
    }
}
/**
 * public class MyArray<T> {
 *     private T[] t;
 *     public MyArray(T[] t){
 *         this.t = t;
 *     }
 *     public void listAll(){
 *         for (int i = 0; i < t.length; i++){
 *             System.out.print(t[i] + " ");
 *         }
 *         System.out.println();
 *     }
 *
 *     public static void main(String[] args) {
 *         Integer[] intArr = {1,2,3,4,5};
 *         MyArray<Integer> a = new MyArray<>(intArr);
 *         String[] stringArr = {"Jane","Tom","Bob"};
 *         MyArray<String> b = new MyArray<>(stringArr);
 *         Character[] charArr = {'a','b','c'};
 *         MyArray<Character> c = new MyArray<>(charArr);
 *     }
 * }
 */