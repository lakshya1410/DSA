class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int n=s.length();
        int max=0;
        HashSet<Character> set = new HashSet<>();
        while(j<n){

            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            max=Math.max(max,j-i+1);
            set.add(s.charAt(j));
            j++;
        }
        return max;
    }
}