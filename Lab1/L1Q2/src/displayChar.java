import java.io.*;
public class displayChar {
    public static void displayChar(String fileName,String regex){
        try {
            BufferedReader read = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("Contents:");
            while ((line = read.readLine()) != null){
                String[] split = line.split(regex);
                for (int i = 0; i < split.length; i++){
                    System.out.print(split[i]);
                }
                System.out.println();
            }
            read.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
