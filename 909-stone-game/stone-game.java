class Solution {
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        int [][] dp = new int[n+1][n+1];
        for(int i=0;i<=n;i++)
        Arrays.fill(dp[i],-1);
        return help(piles,0,n-1,dp)>=0;
    }
    int help(int [] piles,int i,int j,int[][] dp){
        if(i==j) return piles[i];
        if(dp[i][j]!=-1) return dp[i][j];
       return  dp[i][j]=Math.max(piles[i]-help(piles,i+1,j,dp),piles[j]-help(piles,i,j-1,dp));
    }
}