public class tester {
    public static void main(String[] args) {
        String file1 = "text1.txt";
        String file2 = "text2.txt";
        String file3 = "text3.txt";
        String file4 = "text4.txt";
        System.out.println("File 1");
        calcCharNum.readFile(file1,",");
        displayChar.displayChar(file1,",");
        System.out.println();
        System.out.println("File 2");
        calcCharNum.readFile(file2,", ");
        displayChar.displayChar(file2,", ");
        System.out.println();
        System.out.println("File 3");
        calcCharNum.readFile(file3,"; ");
        displayChar.displayChar(file3,"; ");
        System.out.println();
        System.out.println("File 4");
        calcCharNum.readFile(file4,"[0-9]+");
        displayChar.displayChar(file4,"[0-9]+");
    }
}
