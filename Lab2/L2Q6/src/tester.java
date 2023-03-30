public class tester {
    public static void main(String[] args) {
        Integer[][] intArr = {{1,2,3},{7,8,9,10},{4,5,6}};
        System.out.println(MinMaxTwoDArray.min(intArr));
        System.out.println(MinMaxTwoDArray.max(intArr));
        Double[][] doubleArr = {{1.1,2.2,3.3},{9.9,7.6,8.9,6.9},{0.0,1.3,5.7}};
        System.out.println(MinMaxTwoDArray.min(doubleArr));
        System.out.println(MinMaxTwoDArray.max(doubleArr));
        String[][] stringArr = {{"Tneoh","Chuan","Lin"},{"Kennedy","Washington","Georgia","Nelson"},{"John"}};
        System.out.println(MinMaxTwoDArray.min(stringArr));
        System.out.println(MinMaxTwoDArray.max(stringArr));
    }
}
