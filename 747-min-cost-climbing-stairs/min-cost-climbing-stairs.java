class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int [] dp = new int [n+1];
        Arrays.fill(dp,-1);
        return help(cost,dp,n);
    }
    int help(int[] cost,int[] dp,int n){
        if(n==0 || n==1) return 0;
        if(dp[n]!=-1) return dp[n];
        return dp[n]= Math.min(help(cost,dp,n-1)+cost[n-1],help(cost,dp,n-2)+cost[n-2]);
    }
}