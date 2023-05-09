public class FIFOStockTransactionAnalyzer {
    private final Queue<Integer> share;
    private final Queue<Integer> price;
    private int capitalGain;
    public FIFOStockTransactionAnalyzer(){
        this.share = new Queue<>();
        this.price = new Queue<>();
        capitalGain = 0;
    }
    public void buy(int numShares,int pricePerStock){
        System.out.println("Buying now...");
        share.enqueue(numShares);
        price.enqueue(pricePerStock);
        display();
    }
    public void sell(int numShares,int pricePerStock){
        System.out.println("Selling the shares now...");
        if (share.isEmpty()){
            System.out.println("No shares to sell!");
            display();
            return;
        }
        while (numShares > share.peek()){
            capitalGain += share.peek()*(pricePerStock - price.dequeue());
            numShares -= share.dequeue();
            conclude();
            if (share.isEmpty()){
                System.out.println("No shares to sell!");
                display();
                return;
            }
        }
        if (numShares < share.peek()){
            share.setFirst(share.peek() - numShares);
            capitalGain += numShares*(pricePerStock - price.peek());
            conclude();
        }
        else if (numShares == share.peek()){
            share.dequeue();
            capitalGain += numShares*(pricePerStock - price.dequeue());
            conclude();
        }
        display();
    }
    public void conclude(){
        System.out.println("Total Capital Gain / Loss: " + capitalGain);
    }
    public void display(){
        System.out.println("Queue for Share: " + share);
        System.out.println("Queue for Price: " + price);
    }
}