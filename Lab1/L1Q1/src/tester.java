import java.util.*;
public class tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReadMyLetter.main(new String[]{});
        System.out.println();
        System.out.print("Append letter? (Yes: y | No: any character): ");
        char append = sc.next().charAt(0);
        if (append == 'y'){
            AppendMyLetter.main(new String[]{});
        }
    }
}
