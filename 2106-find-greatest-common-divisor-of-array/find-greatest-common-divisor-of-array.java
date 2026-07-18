class Solution {
    public int findGCD(int[] nums) {
          int mn=Integer.MAX_VALUE;
          int ma=Integer.MIN_VALUE;
          for(int i=0;i<nums.length;i++){
            mn=Math.min(mn,nums[i]);
            ma=Math.max(ma,nums[i]);
          }  
          int ans=Integer.MIN_VALUE;
          for(int i=1;i<=mn;i++){
            if(mn%i==0 && ma%i==0)
            ans =Math.max(ans,i);
          }
          return ans;
    }
}