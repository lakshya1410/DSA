class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int[][] temp = new int[mat.length][mat[0].length];
            for(int i = 0; i < mat.length; i++) {
                temp[i] = mat[i].clone();
            }
            k = k % mat[0].length;
            for(int x = 0; x < k; x++) {
        for(int i=0;i<temp.length;i++){
            if(i%2==0){
                int first=temp[i][0];
                for(int j=0;j<temp[i].length-1;j++){
                    temp[i][j]=temp[i][j+1];
                }
                temp[i][temp[0].length-1]=first;
            }
            else{
                int last=temp[i][temp[i].length-1];
                 for(int j = temp[i].length - 1; j > 0; j--) {
                        temp[i][j] = temp[i][j - 1];
                    }
                temp[i][0]=last;
            }
        }
            }
       for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] != temp[i][j]) return false;
            }
        }
            
        return true;
}
}