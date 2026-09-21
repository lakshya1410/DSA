class Solution {
    public int minDistance(String w1, String w2) {
        int n= w1.length();
        int m=w2.length();
        int [][] dp = new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        return help(w1,w2,n,m,dp);
    }
    int help(String w1,String w2,int i,int j,int[][] dp){
        if(i==0) return j;
        if(j==0) return i;
        if(dp[i][j]!=-1) return dp[i][j];

        if(w1.charAt(i-1)==w2.charAt(j-1)){
            return dp[i][j]=help(w1,w2,i-1,j-1,dp);
        }
        int insert=help(w1,w2,i,j-1,dp);
        int delete=help(w1,w2,i-1,j,dp);
        int replace=help(w1,w2,i-1,j-1,dp);

        return dp[i][j]= 1+Math.min(insert,Math.min(delete,replace));
    }
}