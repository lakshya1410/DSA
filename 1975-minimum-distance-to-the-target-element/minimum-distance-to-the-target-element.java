class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min=Integer.MAX_VALUE;
        int x=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target && Math.abs(i-start)<min){
                x=i;
                min=Math.abs(i-start);
            }
        }
        return Math.abs(x-start);
    }
}