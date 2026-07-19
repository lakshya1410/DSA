class Solution {
    Boolean []dp;
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set= new HashSet<>(wordDict);
        dp=new Boolean[s.length()];
        return solve(0,set,s);

    }
    boolean solve(int idx,HashSet<String> set,String s){
        int n=s.length();
        if(idx==n) return true;
        if(dp[idx]!=null) return dp[idx];
        if(set.contains(s)) return true;
        for(int i=idx+1;i<=n;i++){
            String temp=s.substring(idx,i);
            if(set.contains(temp) && solve(i,set,s)){
                return dp[idx]= true;
            }
        }
        return dp[idx]= false;
    }
}