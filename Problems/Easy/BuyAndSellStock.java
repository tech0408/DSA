package dsa.Problems.Easy;
/*
    You are given an array prices where prices[i] is the price of a given stock on the ith day.
    You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
    Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class BuyAndSellStock {

    public static int maxProfit(int [] prices){

        int len = prices.length;
        int stockBuyPrice = prices[0];
        int profit = 0;

        for(int i=1;i<len;i++){

            stockBuyPrice = Math.min(stockBuyPrice,prices[i]);
            profit = Math.max(profit,prices[i]-stockBuyPrice);
        }
        return profit;

    }
    public static void main(String[] args) {

        int [] prices = {7,6,4,3,1}; // [7,1,5,3,6,4] -> 5 //[7,6,4,3,1] -> 0
        System.out.println(maxProfit(prices));
    }
}
