package leetcode.medium.common;

/**
 * {@link <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/">122. Best Time to Buy and Sell Stock II</a>}.
 */
public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int day = 1;
        int profit = 0;
        return countProfit(prices, day, profit);
    }
    private int countProfit(int[] prices, int day, int curProfit) {
        if (day == prices.length) return curProfit;

        int profit = prices[day] < prices[day - 1] ? 0 : prices[day] - prices[day - 1];

        return countProfit(prices, day + 1, curProfit + profit);
    }
}
