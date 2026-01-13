public class BuyAndSellStocks {
    public static int buySellStocks(int prices[]) {
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i = 0; i <prices.length; i++) {
            if(buyPrice<prices[i]) {
                int profit=prices[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                buyPrice=prices[i];
                System.out.println("Low price ,Buy stocks buddy!");
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,17};
        System.out.println("Profit :"+ buySellStocks(prices));
    }
}
