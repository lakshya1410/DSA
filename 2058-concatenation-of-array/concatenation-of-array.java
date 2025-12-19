class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int idx = 0;
        int[] ans = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            ans[i] = nums[idx];
            idx++;
            if (idx == n) idx = 0;
        }
        return ans;
    }
}
