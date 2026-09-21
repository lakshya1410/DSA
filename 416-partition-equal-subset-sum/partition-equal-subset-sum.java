class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int num: nums){
            sum+=num;
        }
        if(sum%2!=0) return false;
        return help(nums,sum/2);
    }
    boolean help(int [] nums,int sum){
       int n=nums.length;
       boolean[][] dp = new boolean[n+1][sum+1];
       for(int i=0;i<=n;i++){
        for(int j=0;j<=sum;j++){
            if(i==0 && j==0) dp[i][j]=true;
            else if(i==0) dp[i][j]=false;
            else if(j==0) dp[i][j]=true;
            else{
                if(nums[i-1]<=j){
                    dp[i][j]=dp[i-1][j] || dp[i-1][j-nums[i-1]];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }

        }

       }
       return dp[n][sum];
    }
}