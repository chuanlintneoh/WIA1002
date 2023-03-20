import java.io.*;
public class calcCharNum {
    public static void readFile(String fileName,String regex){
        try {
            BufferedReader read = new BufferedReader(new FileReader(fileName));
            String line;
            int i = 1;
            while ((line = read.readLine()) != null){
                int numChar = 0;
                String[] split = line.split(regex);
                numChar = countCharacters(split);
                System.out.printf("Number of characters in line %d: %d\n",i,numChar);
                i++;
            }
            read.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static int countCharacters(String[] arr){
        int count = 0;
        for (String element: arr){
            count += element.length();
        }
        return count;
    }
}
