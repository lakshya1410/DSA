class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int[] premax = new int[n];
        int[] suffmax = new int[n];

        premax[0] = height[0];
        for (int i = 1; i < n; i++) {
            premax[i] = Math.max(premax[i - 1], height[i]);
        }

        suffmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffmax[i] = Math.max(suffmax[i + 1], height[i]);
        }

        int total = 0;
        for (int i = 0; i < n; i++) {
            total += Math.min(premax[i], suffmax[i]) - height[i];
        }

        return total;
    }
}
