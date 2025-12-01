class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n][n+1];
        for(int i=0;i<n;i++) Arrays.fill(dp[i],-1);
        return lis(0,-1,nums,dp);

    }
    int lis(int ind,int prev,int[] nums,int [][] dp){
        if(ind==nums.length) return 0;
        if(dp[ind][prev+1]!=-1) return dp[ind][prev+1];
        int len=lis(ind+1,prev,nums,dp);
        if(prev==-1 || nums[ind]>nums[prev]){
            len =Math.max(len,1+lis(ind+1,ind,nums,dp));
        }
        
        return dp[ind][prev+1]=len;
    }

}