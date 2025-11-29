class Solution {
    public boolean isSubsequence(String s, String t) {
        int lcs=longestCommonSubsequence(s,t);
        if(s.length()==lcs) return true;
        else return false;
    }
     public int longestCommonSubsequence(String x, String y) {
        int n=x.length();
        int m=y.length();
        int [][] dp= new int[n+1][m+1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0 || j==0) dp[i][j]=0;
               else if(x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
}