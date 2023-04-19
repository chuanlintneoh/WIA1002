public class TestSList {
    public static void main(String[] args) {
        SList<String> SList = new SList<>();
        String values = "Linked list, is, easy.";
        String[] tokens = values.split(", ");
        for (String token:tokens){
            SList.appendEnd(token);
        }
        SList.display();
        System.out.println(SList.removeInitial());
        System.out.println("'difficult' in the list: " + SList.contains("difficult"));
        SList.clear();
    }
}
