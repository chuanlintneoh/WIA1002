public class OnlineShopper {
    public static void main(String[] args) {
        Item[] items = {new Item("Bird Feeder",2050),
                new Item("Squirrel Guard",1547),
                new Item("Bird Bath",4499),
                new Item("Sunflower Seeds",1295)};
        BagInterface<Item> shoppingCart = new Bag<>();
        int totalCost = 0;
        for (int index = 0; index < items.length; index++){
            Item nextItem = items[index];
            shoppingCart.add(nextItem);
            totalCost = totalCost + nextItem.getPrice();
        }
        while(!shoppingCart.isEmpty()){
            System.out.println(shoppingCart.remove());
        }
        System.out.println("Total cost: " + "\t$" + totalCost/100 + "." + totalCost%100);
    }
}
