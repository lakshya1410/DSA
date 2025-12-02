class Solution {
    int[] dp;

    public int climbStairs(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return step(n);
    }

    int step(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;

        if (dp[n] != -1) return dp[n];

        dp[n] = step(n - 1) + step(n - 2);
        return dp[n];
    }
}
