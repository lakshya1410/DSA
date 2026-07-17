class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return help(m-1,n-1,grid,dp);
        
    }
    int help(int i,int j,int[][] grid,int[][] dp){
        if(i<0 || j<0) return Integer.MAX_VALUE;
        if(i==0 && j==0) return grid[0][0];
        if(dp[i][j]!=-1) return dp[i][j];
       int up=help(i-1,j,grid,dp);
       int left=help(i,j-1,grid,dp);
       return dp[i][j]=grid[i][j]+Math.min(up,left);
    }
}