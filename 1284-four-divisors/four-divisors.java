class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;

        for (int n : nums) {
            int cnt = 0;
            int sum = 0;

            for (int d = 1; d * d <= n; d++) {
                if (n % d == 0) {
                    cnt++;
                    sum += d;

                    if (d != n / d) {
                        cnt++;
                        sum += n / d;
                    }
                }

                if (cnt > 4) break; 
            }

            if (cnt == 4) ans += sum;
        }
        return ans;
    }
}
