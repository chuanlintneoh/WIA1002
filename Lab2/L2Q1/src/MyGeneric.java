public class MyGeneric <T>{
    private T e;
    public MyGeneric(){

    }
    public MyGeneric(T e){
        setE(e);
    }
    public T getE(){
        return e;
    }
    public void setE(T e){
        this.e = e;
    }
}
