class Solution {
    public static int minOperations(int[] nums, int k) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        int remainder = total % k;
        return remainder == 0 ? 0 : remainder;
    }
    
}