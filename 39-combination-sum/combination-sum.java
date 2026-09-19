class Solution {
    public List<List<Integer>> combinationSum(int[] can, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        help(ans,curr,0,target,can);
        return ans;

    }
    void help(List<List<Integer>> ans, List<Integer> curr,int ind,int target,int [] can){
       if(ind==can.length){
        if(target==0){
            ans.add(new ArrayList<>(curr));
           
        }
         return;
       }
        if(can[ind]<=target){
            curr.add(can[ind]);
            help(ans,curr,ind,target-can[ind],can);
            curr.remove(curr.size()-1);
        }
        help(ans,curr,ind+1,target,can);
    }
}