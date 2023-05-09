import java.util.*;
public class tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");//a man, a plan, a canal: panama
        String word = sc.nextLine().replaceAll("[^a-zA-Z]+", "");
        char[] split = word.toCharArray();
        Character[] alphabets = new Character[split.length];
        for (int i = 0; i < split.length; i++){
            alphabets[i] = split[i];
        }
        Queue<Character> chars = new Queue<>(alphabets);
        System.out.println(chars + " is palindrome? " + isPalindrome(chars));
    }
    public static boolean isPalindrome(Queue<Character> queue){
        if (queue.isEmpty()){
            return false;
        }
        int numChar = queue.getSize();
        if (numChar % 2 != 0){
            numChar -= 1;
        }//convert odd number of characters to even
        for (int i = 0; i < numChar/2; i++){
            if (!queue.getElement(i).equals(queue.getElement(queue.getSize() - (i+1)))){
                return false;
            }
        }//compare first with last, 2nd with 2nd last so on and so forth
        return true;
    }
}
