class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][] dp= new int[n][2];
        for(int i=0;i<n;i++) Arrays.fill(dp[i],-1);
        return max(prices,0,1,dp);
    }
    int max(int[] prices,int ind,int buy,int[][] dp){
        if(ind>=prices.length) return 0;
        if(dp[ind][buy]!=-1) return dp[ind][buy];
       
        
        if(buy==1){
           dp[ind][buy]= Math.max(-prices[ind]+max(prices,ind+1,0,dp),0+max(prices,ind+1,1,dp));
        }
        else{
            dp[ind][buy]= Math.max(prices[ind]+max(prices,ind+2,1,dp),0+max(prices,ind+1,0,dp));
        }
        return dp[ind][buy];
    }
}