package org.example.set7_array_searching;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int least = prices[0];
        for (int i = 0; i < prices.length; i++) {
            least = Math.min(least, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - least);
        }
        return maxProfit;
    }
}
