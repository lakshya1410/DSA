class Solution {
    public int integerBreak(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return help(n,dp);
    }
    int help(int n , int [] dp){
        if(n==0) return 1;
        if(dp[n]!=-1) return dp[n];
        int ans=1;
        for(int i=1;i<n;i++){
            ans = Math.max(ans, Math.max(i*(n-i), i*help(n-i, dp)));
        }
        return dp[n]=ans;
    }
}