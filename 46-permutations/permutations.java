class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        help(nums,ans,cur,freq);
        return ans;

    }
    void help(int[] nums,List<List<Integer>> ans ,List<Integer> cur,   boolean freq[]   ){
        if(cur.size()==nums.length) ans.add(new ArrayList<>(cur));
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                cur.add(nums[i]);
                help(nums,ans,cur,freq);
                cur.remove(cur.size()-1);
                freq[i]=false;
            }
        }
    }
}