class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
       int max=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i]; 
            }
        }
        int low=1;
        int high=max;
        int ans=0;
        while(low<=high){
           int  mid=low+(high-low)/2;
            int sum=sumfordivisor(mid,nums);
            if(sum<=threshold){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans; 

    }
    int sumfordivisor(int mid,int [] nums){
        int sum=0;
        for(int num : nums) sum += (num + mid - 1) / mid;
        return sum;
    }
}