class Solution {
    public int countNegatives(int[][] grid) {
        int n= grid.length;
        int m= grid[0].length;
        int cnt=0;
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(grid[i][j]<0) cnt++;
                else break;
            }
        }
        return cnt;
    }
}