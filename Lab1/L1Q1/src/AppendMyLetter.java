import java.io.*;
import java.util.*;
public class AppendMyLetter {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("TneohChuanLin_22004808.txt",true));
            System.out.println("Append your letter");
            Scanner sc = new Scanner(System.in);
            System.out.println("Type your contents below, enter \"q\" to quit:");
            writer.write("\n");
            writer.write("\n");
            String line = "";
            while (!(line = sc.nextLine()).equals("q")){
                writer.write(line);
                writer.write("\n");
            }
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
