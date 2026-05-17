class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int low=0;
        int med =0;
        int high=n-1;
        while(med<=high){
            if(nums[med]==0){
                swap(nums,low,med);
                low++;
                med++;
            }
           else if(nums[med]==1){
                med++;
            }
            else{
                swap(nums,med,high);
                    high--;
                
            }
        }
        
    }
     void swap(int[] nums, int a, int b) {

        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}