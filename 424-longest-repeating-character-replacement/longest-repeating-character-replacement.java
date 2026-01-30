class Solution {
    public int characterReplacement(String s, int k) {
        int maxf=0,maxlen=0;
        int l=0,r=0;
        int hash[]=new int[26];
        while(r<s.length()){
            hash[s.charAt(r)-'A']++;
            maxf=Math.max(maxf,hash[s.charAt(r)-'A']);
            while((r-l+1-maxf)>k){
                hash[s.charAt(l)-'A']--;
                
            
                maxf=0;
                for(int i=0;i<26;i++)
                maxf=Math.max(maxf,hash[i]);
                    l++;
            }
            if((r-l+1)-maxf<=k)
            maxlen=Math.max(maxlen,r-l+1);
                r++;
            

        }
        return maxlen;
    }
}