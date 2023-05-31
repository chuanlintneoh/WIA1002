import java.util.ArrayList;
import java.util.List;
public class Main {
    public static List<String> permuteString(String s){
        return permute("",s);
    }
    public static List<String> permute(String beginningString, String remainingString){
        List<String> results = new ArrayList<>();
        if (remainingString.length() == 1){
            results.add(beginningString + remainingString);
        }
        else {
            for (int i = 0; i < remainingString.length(); i++){
                String newBeginning = beginningString + remainingString.charAt(i);
                String newRemaining = remainingString.substring(0, i) + remainingString.substring(i + 1);
                results.addAll(permute(newBeginning, newRemaining));
            }
        }
        return results;
    }
    public static void main(String[] args) {
        System.out.println(permuteString("ABC"));
    }
}