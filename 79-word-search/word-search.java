class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        boolean[][] vis= new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0)){
                    if(help(""+word.charAt(0),board,word,i,j,vis)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    boolean help(String s,char[][] board,String word,int i,int j,boolean[][] vis){
        int m=board.length;
        int n=board[0].length;
        vis[i][j]=true;
        if(s.length()==word.length()) {
            if(s.equals(word)) return true;
        }
        if(s.length()>=word.length()){
            vis[i][j]=false;
            return false;
        }
        if(i-1>=0 && vis[i-1][j]==false){
           if( help(s+board[i-1][j],board,word,i-1,j,vis))
            return true;
        }
        if(i+1<m && vis[i+1][j]==false){
           if( help(s+board[i+1][j],board,word,i+1,j,vis))
            return true;
        }
        if(j-1>=0 && vis[i][j-1]==false){
           if( help(s+board[i][j-1],board,word,i,j-1,vis))
            return true;
        }
        if(j+1<n && vis[i][j+1]==false){
           if( help(s+board[i][j+1],board,word,i,j+1,vis))
            return true;
        }
        vis[i][j]=false;
        return false;
    }

}