public class Item {
    private String name;
    private int price;
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String toString() {
        return String.format("%-15s $%d.%d",name,price/100,price%100);
    }
}
