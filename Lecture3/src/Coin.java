public class Coin {
    public enum CoinName {PENNY, NICKEL, DIME, QUARTER, FIFTY_CENT, DOLLAR}
    private int coinValue;
    private int mintYear;
    private CoinName coinName;
    public Coin(int coinValue,int mintYear){
        switch (coinValue){
            case 1:
                coinName = CoinName.PENNY;
                break;
            case 5:
                coinName = CoinName.NICKEL;
                break;
            case 10:
                coinName = CoinName.DIME;
                break;
            case 25:
                coinName = CoinName.QUARTER;
                break;
            case 50:
                coinName = CoinName.FIFTY_CENT;
                break;
            case 100:
                coinName = CoinName.DOLLAR;
                break;
            default:
                coinName = CoinName.PENNY;
                break;
        }
        this.coinValue = coinValue;
        this.mintYear = mintYear;
    }
    public CoinName getCoinName(){
        return coinName;
    }
    public int getValue(){
        return coinValue;
    }
}
