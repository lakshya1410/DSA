class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n][2][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return max(prices, 0, 1, 2, dp);
    }

    int max(int[] prices, int ind, int buy, int cap, int[][][] dp) {
        if (ind == prices.length || cap == 0) return 0;
        if (dp[ind][buy][cap] != -1) return dp[ind][buy][cap];

        int profit;
        if (buy == 1) {
            profit = Math.max(
                -prices[ind] + max(prices, ind + 1, 0, cap, dp),
                0 + max(prices, ind + 1, 1, cap, dp)
            );
        } else {
            profit = Math.max(
                prices[ind] + max(prices, ind + 1, 1, cap - 1, dp),
                0 + max(prices, ind + 1, 0, cap, dp)
            );
        }

        return dp[ind][buy][cap] = profit;
    }
}