// 🧩 Problem 18 — Best Time to Buy & Sell Stock

// You are given an integer array prices where:
// prices[i] represents the stock price on the i-th day.
// You can buy once and sell once.
// You must buy before you sell.
// Find the maximum profit you can make.
// Given:
// int[] prices = {7, 1, 5, 3, 6, 4};
public class array_18 {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int minprice = prices[0];
        int maxprofit = 0;
        int currentprofit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];

            }
            currentprofit = prices[i] - minprice;

            if (currentprofit > maxprofit) {
                maxprofit = currentprofit;
            }

        }
System.out.println("Max Profit is: "+maxprofit);
    }
}
