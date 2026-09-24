class pair{
    int r;
    int c;
    pair(int r,int c){
        this.r=r;
        this.c=c;
    }
}


class Solution {
    public int orangesRotting(int[][] grid) {
        int [][] dir ={{0,1},{1,0},{0,-1},{-1,0}};
        int m=grid.length;
        int n=grid[0].length;
        Queue<pair> q= new LinkedList<>();
        int fo=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new pair(i,j));
                }else if(grid[i][j]==1){
                    fo++;
                }
            }
        }
        if(fo==0) return 0;
        int min=0;
        while(!q.isEmpty()){
            int N=q.size();
            while(N-- > 0){
                pair curr=q.poll();
                int i=curr.r;
                int j=curr.c;

                for(int[] d : dir){
                    int ni=i+d[0];
                    int nj=j+d[1];
                    if(ni>=0 && ni<m && nj>=0 && nj<n && grid[ni][nj]==1){
                        grid[ni][nj]=2;
                        q.add(new pair(ni,nj));
                        fo--;
                    }
                }
            }
            min++;
        }
        return fo==0 ? (min-1) : -1;
    }
}