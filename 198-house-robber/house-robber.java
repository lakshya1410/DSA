// class Solution {
//     public int rob(int[] nums) {
//         int n= nums.length;
//       return func(n-1,nums);
//     }
//    int  func(int ind,int[] nums){
//         if(ind==0) return nums[0];
//         if(ind<0) return 0;

//         int pick=nums[ind] + func(ind-2,nums);
//         int notpick= 0+ func(ind-1,nums);
//         return Math.max(pick,notpick);
//     }
// }

//this gives TLE because this is recursion next is after memization

// class Solution {
//     public int rob(int[] nums) {
//         int n= nums.length;
//         int dp[]= new int[n];
//         Arrays.fill(dp,-1);
//       return func(n-1,nums,dp);
//     }
//    int  func(int ind,int[] nums,int []dp){
//         if(ind==0) return nums[0];
//         if(ind<0) return 0;
//         if(dp[ind]!=-1) return dp[ind];

//         int pick=nums[ind] + func(ind-2,nums,dp);
//         int notpick= 0+ func(ind-1,nums,dp);
//         return dp[ind]=Math.max(pick,notpick);
//     }
// }

//after tabulation and space otimization 

class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
       int prev=nums[0];
       int prev2=0;

       for(int i=1;i<n;i++){
        int take =nums[i];
        if(i>1) take+=  prev2;

        int nottake =0+ prev;
        int curi=Math.max(take,nottake);
        prev2=prev;
        prev=curi;
       }
        
        return prev;
    }
  
}
