class Solution {
    public int jump(int[] nums) {
        int jumps=0;
        int end=0;
        int max=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            max=Math.max(max,i+nums[i]);
            if(i==end){
                jumps++;
                end=max;
            }
        }
        return jumps;
    }
}