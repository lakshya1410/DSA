class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<Integer> curr = new ArrayList<>();
        Arrays.sort(nums);
        getsubset(nums,curr,0);
        return ans;
        
    }
    void getsubset(int [] nums,ArrayList<Integer> curr,int i){
        if(i==nums.length){ans.add(new ArrayList<>(curr));
        return;} 
        curr.add(nums[i]);
        getsubset(nums,curr,i+1);
        curr.remove(curr.size()-1);
        int idx=i+1;
        while(idx<nums.length && nums[idx]==nums[idx-1]){
            idx++;
        }
        getsubset(nums,curr,idx);
    }
}