class Solution {
    public List<List<Integer>> combinationSum2(int[] cand, int target) {
         List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(cand);
       // boolean[] vis= new boolean[cand.length];
        help(ans,curr,cand,target,0);
        return ans;

    }
    void help(List<List<Integer>> ans,List<Integer> curr,int [] cand,int target,int ind ){
       
            if(target==0){
                ans.add(new ArrayList<>(curr));
                return;
            }
            

       for(int i=ind;i<cand.length;i++){
        if(i>ind && cand[i]==cand[i-1]) continue;
        if(cand[i]>target) break;

        curr.add(cand[i]);
        help(ans,curr,cand,target-cand[i],i+1);
        curr.remove(curr.size()-1);
       }
    }
}