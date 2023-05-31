public class Main {
    public static String reverseString(String s){
        if (s.isEmpty()){
            return s;
        }
        else {
            char firstChar = s.charAt(0);
            String remainingString = s.substring(1);
            return reverseString(remainingString) + firstChar;
        }
    }
    public static void main(String[] args) {
        System.out.println(reverseString("String"));
    }
}