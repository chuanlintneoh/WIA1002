public class Container <T>{
    private T t;
    public Container(){

    }
    public void add(T t){
        this.t = t;
    }
    public T retrieve(){
        return t;
    }

    public static void main(String[] args) {
        Container<Integer> a = new Container<>();
        a.add(50);
        Container<String> b = new Container<>();
        b.add("Java");
        System.out.printf("Object in Integer Container a: %s\n",a.retrieve());
        System.out.printf("Object in String Container b: %s\n",b.retrieve());
    }
}
