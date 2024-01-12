package leetcode.easy.common;

/**
 * {@link <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">121. Best Time to Buy and Sell Stock</a>}.
 */
public class BestTimeToBuyAndSellStock {

    //brute force, time out
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;

        int profit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] < prices[i]) continue;
                profit = Math.max(profit, prices[j] - prices[i]);
            }
        }
        return profit;
    }

    public int maxProfitI(int[] prices) {
        if (prices.length <= 1) return 0;

        int n = prices.length;
        int[] dp = new int[n];
        dp[0] = 0;
        int minPrice = prices[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }

        return dp[n - 1];
    }
}
