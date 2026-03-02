class Solution {
    public int countSubstrings(String s) {
        int n= s.length();
        boolean dp[][]= new boolean[n][n];
        int count=0;
        for(int i = n - 1; i >= 0; i--){
            for(int j=i;j<n;j++){
                if(i==j){
                    dp[i][j]=true;
                }
                else if(j-i==1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=true;
                    }
                    else{
                        dp[i][j]=false;
                    }
                }
                else{
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true){
                        dp[i][j]=true;
                    }
                    else{
                        dp[i][j]=false;
                    }
                }
                if(dp[i][j]) count++;
            }
        }
        return count;
    }
}