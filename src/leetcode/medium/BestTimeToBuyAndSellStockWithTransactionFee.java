package leetcode.medium;

/**
 * {@link <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/">714. Best Time to Buy and Sell Stock with Transaction Fee</a>}.
 */
public class BestTimeToBuyAndSellStockWithTransactionFee {

    public int maxProfit(int[] prices, int fee) {
        int buy = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] > buy + fee) {
                profit += prices[i] - buy - fee;
                buy = prices[i] - fee;
            }
        }
        return profit;
    }

    public int maxProfitFast(int[] prices, int fee) {
        int len = prices.length, buying = 0, selling = -prices[0];
        for (int i = 1; i < len; i++) {
            buying = Math.max(buying, selling + prices[i] - fee);
            selling = Math.max(selling, buying - prices[i]);
        }
        return buying;
    }
}
