class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 > n2) return false;

        int[] hash = new int[26];
        for (int i = 0; i < n1; i++) {
            hash[s1.charAt(i) - 'a']++;
        }

        int[] hash2 = new int[26];
        int winidx = 0;

        for (int idx = 0; idx < n2; idx++) {
            hash2[s2.charAt(idx) - 'a']++;
            winidx++;

            if (winidx > n1) {
                hash2[s2.charAt(idx - n1) - 'a']--;
                winidx--;
            }

            if (winidx == n1 && isfreqsame(hash, hash2)) {
                return true;
            }
        }
        return false;
    }

    boolean isfreqsame(int[] ar1, int[] ar2) {
        for (int i = 0; i < 26; i++) {
            if (ar1[i] != ar2[i]) return false;
        }
        return true;
    }
}