public interface BidInterface {
    public String getCompanyName();
    /**
     * Returns the name of the company making this bid.
     */
    public String getACDesc();
    /**
     * Returns the description of the air conditioner that this bid is for.
     */
    public double getACCapacity(int capacity);
    /**
     * Take capacity of this bid's AC in BTU
     * Calculate the number of tonnes
     * Returns the capacity of this bid's AC in tons (1 ton = 12,000 BTU).
     */
    public double getACSEER();
    /**
     * Returns the seasonal efficiency of this bid's AC (SEER).
     */
    public double getACCost();
    /**
     * Returns the cost of this bid's AC.
     */
    public double getACInstallCost();
    /**
     * Returns the cost of installing this bid's AC.
     */
    public double getACYearlyOperatingCost();
    /**
     * Returns the yearly cost of operating this bid's AC.
     */
}
