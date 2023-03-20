import java.io.*;
public class ReadMyLetter {
    public static void main(String[] args) {
        try {
            BufferedReader file = new BufferedReader(new FileReader("TneohChuanLin_22004808.txt"));
            String line;
            while ((line = file.readLine()) != null) {
                System.out.println(line);
            }
            file.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
