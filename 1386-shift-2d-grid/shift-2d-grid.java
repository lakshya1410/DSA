class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int [] temp= new int[m*n];
        int id=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               temp[id++]=grid[i][j];
            }
        }
        k=k%(m*n);
        reverse(temp,0,(m*n)-1);
        reverse(temp,0,k-1);
        reverse(temp,k,(m*n)-1);
         id=0;

        List<List<Integer>>  ans = new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer> row= new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(temp[id++]);
            }
            ans.add(row);
        }
        return ans;
    }
    void reverse(int[] temp,int i,int j){
        while(i<j){int r=temp[i];
        temp[i]=temp[j];
        temp[j]=r;
        i++;
        j--;}
    }
}