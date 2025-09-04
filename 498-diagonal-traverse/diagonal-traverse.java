class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n= mat.length;
        int m= mat[0].length;
        int[] ans = new int[m * n];

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int key = i+j;

                map.computeIfAbsent(key, k -> new ArrayList<>()).add(mat[i][j]);
            }
        }
        int idx =0;
        for(int k=0;k<m+n-1;k++){
            List<Integer> diag = map.get(k);
            if(k%2==0){
                Collections.reverse(diag);

            }
             for (int val : diag) {
                ans[idx++] = val;
            }
        }
        return ans;
    }
}