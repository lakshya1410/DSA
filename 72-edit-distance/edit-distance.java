class Solution {
    int [][] dp;
    public int minDistance(String w1, String w2) {
        dp = new int[w1.length() + 1][w2.length() + 1];
        for (int i = 0; i <= w1.length(); i++) {
            for (int j = 0; j <= w2.length(); j++) {
                dp[i][j] = -1;
            }
        }
        return solve(w1,w2,w1.length(),w2.length());
        
    }
    int solve(String w1,String w2,int i,int j){
        if(i==0) return j;
        if(j==0) return i;

        if (dp[i][j] != -1) return dp[i][j];

        if(w1.charAt(i-1)==w2.charAt(j-1)){
            return solve(w1,w2,i-1,j-1);
        }
        int insert=solve(w1,w2,i,j-1);
        int delete=solve(w1,w2,i-1,j);
        int replace=solve(w1,w2,i-1,j-1);

       return  dp[i][j]= 1+Math.min(insert,Math.min(delete,replace));

    }
}