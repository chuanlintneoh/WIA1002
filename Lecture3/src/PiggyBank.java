public class PiggyBank {
    private BagInterface<Coin> coins;
    public PiggyBank(){
        coins = new Bag<>();
    }
    public boolean add(Coin aCoin){
        return coins.add(aCoin);
    }
    public Coin remove(){
        return coins.remove();
    }
    public boolean isEmpty(){
        return coins.isEmpty();
    }
}
