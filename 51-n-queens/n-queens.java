class Solution {
    public List<List<String>> solveNQueens(int n) {
       List<List<String>> ans = new ArrayList<>();
       List<String> board= new ArrayList<>();
      
        for(int i = 0; i < n; i++){
            String row = ".".repeat(n);
            board.add(row);
        }
        solve(0,board,ans,n);
        return ans;

    }

    void solve(int col,List<String> board,List<List<String>> ans,int n){
        if(col==n){
            ans.add(new ArrayList<>(board));
            return;
        }
        for(int row=0;row<n;row++){
            if(issafe(row,col,board,n)){
                 char[] arr = board.get(row).toCharArray();
                arr[col] = 'Q';
                board.set(row, new String(arr));
                solve(col+1,board,ans,n);
               arr[col] = '.';
                board.set(row, new String(arr));
            }
        }

    }
    boolean issafe(int row,int col,List<String> board,int n){
        int duprow=row;
        int dupcol=col;

        while(row>=0 && col>=0){
            if(board.get(row).charAt(col) == 'Q') return false;
            row--;
            col--;
        }
        
        row=duprow;
        col=dupcol;
        while(col>=0){
            if(board.get(row).charAt(col) == 'Q') return false;
            col--;
        }
        row=duprow;
        col=dupcol;
         while(row<n && col>=0){
            if(board.get(row).charAt(col) == 'Q') return false;
            row++;
            col--;
        }
        return true;
        
    }
}