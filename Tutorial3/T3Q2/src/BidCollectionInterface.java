public interface BidCollectionInterface {
    public void addBid(BidInterface bid);
    /**
     * Adds a bid to this collection.
     */
    public BidInterface getBestYearlyCost();
    /**
     * Returns the bid in this collection with the best yearly cost.
     */
    public BidInterface getBestInitialCost();
    /**
     * Returns the bid in this collection with the best initial cost. The initial cost will be defined as the unit cost plus the installation cost.
     */
    public void clear();
    /**
     * Clears all of the items from this collection.
     */
    public int getNumberOfItems();
    /**
     * Gets the number of items in this collection.
     */
    public boolean isEmpty();
    /**
     * Sees whether this collection is empty.
     */
}
