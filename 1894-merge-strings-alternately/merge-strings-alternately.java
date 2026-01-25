class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l= Math.max(word1.length(),word2.length());
        int m=word1.length();
        int n= word2.length();
        String res="";
       for(int i=0;i<l;i++){
            if(m>0) {
                res+=word1.charAt(i);
                m--;
                }
            if(n>0) {
                res+=word2.charAt(i);
                n--;
                }
       }
       return res; 
    }
}