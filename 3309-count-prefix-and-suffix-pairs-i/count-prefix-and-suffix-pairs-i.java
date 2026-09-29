class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        int n=words.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(isprefixandsuffix(words[i],words[j])) count++;
            }
        }
        return count;
    }
    boolean isprefixandsuffix(String s1,String s2){
        if(s1.length()>s2.length()) return false;
        return s2.startsWith(s1) && s2.endsWith(s1);
    }
}