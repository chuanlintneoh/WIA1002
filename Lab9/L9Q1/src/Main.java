public class Main {
    public static String substituteAI(String s){
        if (s.isEmpty()){
            return s;
        }
        else {
            char firstChar = s.charAt(0);
            if (firstChar == 'a'){
                firstChar = 'i';
            }
            String remainingString = s.substring(1);
            return firstChar + substituteAI(remainingString);
        }
    }
    public static void main(String[] args) {
        System.out.println(substituteAI("flabbergasted"));
        System.out.println(substituteAI("Astronaut"));
    }
}