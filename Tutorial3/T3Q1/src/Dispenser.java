public class Dispenser {
    private String item;
    private double price;
    private int stock;
    public Dispenser(String item,double price,int stock){
        this.item = item;
        this.price = price;
        this.stock = stock;
    }
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}
