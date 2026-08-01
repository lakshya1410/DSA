class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n= nums.length;
        int [][] dp = new int[n+1][n+1];
        for(int i=0;i<n;i++)
        Arrays.fill(dp[i],-1);
        return help(nums,0,n-1,dp)>=0;

    }
    int help(int[] nums, int i,int j,int[][] dp){
        if(i==j) return nums[i];
        if(dp[i][j]!=-1) return dp[i][j];
        return dp[i][j]=Math.max(nums[i]-help(nums,i+1,j,dp),nums[j]-help(nums,i,j-1,dp));

    }
}