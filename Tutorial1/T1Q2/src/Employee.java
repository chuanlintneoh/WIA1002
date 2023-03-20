public class Employee extends Person{
    public Employee(){
        this("2");
        System.out.println("3");
    }
    public Employee(String s){
        System.out.println(s);
    }
}
