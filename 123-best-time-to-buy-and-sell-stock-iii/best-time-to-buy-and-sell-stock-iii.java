class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n+1][2][3];
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < 2; j++) {
        //         Arrays.fill(dp[i][j], -1);
        //     }
        // }
        for(int ind=n-1;ind>=0;ind--){
            for(int buy=0;buy<=1;buy++){
                for(int cap=1;cap<=2;cap++){
                                if (buy == 1) {
                     dp[ind][buy][cap] = Math.max(
                            -prices[ind] +dp[ind + 1][ 0][cap],
                            0 + dp[ind + 1][ 1][ cap]
                        );
                    } else {
                       dp[ind][buy][cap] = Math.max(
                            prices[ind] + dp[ind + 1][1][ cap - 1],
                            0 +dp[ind + 1] [0][ cap]);
                    }
                }
            }
        }
        return dp[0][1][2];
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