// class Solution {
//     int [][] dp;

//     public int minCut(String s) {
//         int n = s.length();
//         dp = new int[n][n];
//         for (int i = 0; i < n; i++) {
//             Arrays.fill(dp[i], -1);
//         }
//         return solve(s, 0, n - 1);
//     }

//     int solve(String s, int i, int j) {
//         if (i >= j) return 0;
//         if (ispalindrome(s, i, j)) return 0;

//         if (dp[i][j] != -1) return dp[i][j];

//         int mn = Integer.MAX_VALUE;

//         for (int k = i; k < j; k++) {

//             int left;
//             if (dp[i][k] != -1) {
//                 left = dp[i][k];
//             } else {
//                 left = solve(s, i, k);
//                 dp[i][k] = left;
//             }

//             int right;
//             if (dp[k + 1][j] != -1) {
//                 right = dp[k + 1][j];
//             } else {
//                 right = solve(s, k + 1, j);
//                 dp[k + 1][j] = right;
//             }

//             int temp = 1 + left + right;

//             if (temp < mn) mn = temp;
//         }

//         dp[i][j] = mn;
//         return mn;
//     }

//     boolean ispalindrome(String s, int i, int j) {
//         while (i < j) {
//             if (s.charAt(i) != s.charAt(j)) return false;
//             i++;
//             j--;
//         }
//         return true;
//     }
// }
class Solution {
    int[][] dp;

    public int minCut(String s) {
        int n = s.length();
        dp = new int[n][n];
        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i], -1);
        }
        return solve(s, 0, n - 1);
    }

    int solve(String s, int i, int j) {
        if (i >= j) return 0;
        if (ispalindrome(s, i, j)) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        int mn = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {

            // ONLY cut when left part is palindrome
            if (ispalindrome(s, i, k)) {

                int right;
                if (dp[k + 1][j] != -1) {
                    right = dp[k + 1][j];
                } else {
                    right = solve(s, k + 1, j);
                    dp[k + 1][j] = right;
                }

                int temp = 1 + right;

                if (temp < mn) mn = temp;
            }
        }

        dp[i][j] = mn;
        return mn;
    }

    boolean ispalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
