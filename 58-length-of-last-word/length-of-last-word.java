class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int n= s.length();
        int idx=s.lastIndexOf(" ");
        String str = s.substring(idx+1,n);
        return str.length();
    }
}