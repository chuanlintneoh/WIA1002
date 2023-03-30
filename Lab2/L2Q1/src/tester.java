public class tester {
    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric<>();
        MyGeneric<Integer> intObj = new MyGeneric<>();
        strObj.setE("Hello World!");
        intObj.setE(6);
        System.out.println(strObj.getE());
        System.out.println(intObj.getE());
    }
}
