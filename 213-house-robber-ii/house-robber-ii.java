class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        
     
        int[] temp1 = new int[n - 1];
        System.arraycopy(nums, 0, temp1, 0, n - 1);
        int max1 = maxadjacentsum(temp1);
        
        int[] temp2 = new int[n - 1];
        System.arraycopy(nums, 1, temp2, 0, n - 1);
        int max2 = maxadjacentsum(temp2);
        
        return Math.max(max1, max2);
    }
    
    public int maxadjacentsum(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        
        int prev = nums[0];
        int prev2 = 0;
        for (int i = 1; i < n; i++) {
            int take = nums[i];
            if (i > 1) take += prev2;

            int nottake = 0 + prev;
            int curi = Math.max(take, nottake);
            prev2 = prev;
            prev = curi;
        }
        
        return prev;
    }
}