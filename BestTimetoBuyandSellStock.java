public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) 
    {
        int minPrice = Integer.MAX_VALUE ;
        int profit = 0;
        for(int price : prices)
        {
            if(price < minPrice)
            {
                minPrice = price;
            }
            else
            {
                profit = Math.max(profit, price-minPrice);
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        BestTimetoBuyandSellStock solution = new BestTimetoBuyandSellStock();
        int[] prices = {7,1,5,3,6,4};
        int maxProfit = solution.maxProfit(prices);
        System.out.println("Maximum profit: " + maxProfit);
    }
}
