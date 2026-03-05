class Solution {
    public int numSquares(int n) {
        int [] dp= new int[n+1];
        Arrays.fill(dp,-1);
        return help(dp,n);
    }
    int help(int[] dp, int n){
        if(n==0) return 0;
        if(dp[n]!=-1) return dp[n];
        int ans=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            ans=Math.min(ans,1+help(dp,n-i*i));
        }
        return dp[n] = ans; 

    }
}