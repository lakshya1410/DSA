class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        help(ans,curr,nums,new boolean[nums.length]);
        return ans;
    }
    void help(List<List<Integer>> ans , List<Integer> curr,int [] nums,boolean[] freq){
        if(curr.size()==nums.length) ans.add(new ArrayList<>(curr));
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                curr.add(nums[i]);
                help(ans,curr,nums,freq);
                curr.remove(curr.size()-1);
                freq[i]=false;
            }
        }
        
    }
}