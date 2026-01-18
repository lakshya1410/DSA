class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int longest=0;
        int last=Integer.MAX_VALUE;
        int current=0;
        for(int i=0;i<nums.length;i++){
            if( last==nums[i]-1){
                current++;
                last=nums[i];
            }
            else if(last!=nums[i]){
                current=1;
                last=nums[i];
            }
            longest=Math.max(current,longest);
        }
        return longest;
    }
}