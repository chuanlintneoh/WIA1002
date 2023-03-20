public class tester {
    public static void main(String[] args) {
        Animal a = new Chicken();
        eat(a);
        a = new Duck();
        eat(a);
    }
    public static void eat(Animal a){
        System.out.println(a.howtoEat());
    }
}
