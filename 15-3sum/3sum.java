class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        
        List<List<Integer>> ans = new ArrayList<>();
        if(n<3) return ans;
        for(int i=0;i<n;i++){
            if(i!=0){
                if(nums[i]==nums[i-1]) continue;
            }
            int target=-nums[i];
            int left=i+1;
            int right=n-1;
            while(left<right){
                 int currsem=nums[left]+nums[right];
                 if(currsem>target){
                    right--;

                 }
                 else if(currsem<target){
                    left++;
                 }
                
               
               else{
                while(left<right &&nums[left]==nums[left+1]) {
                    left++;
                    
                }
                while(left<right && nums[right]==nums[right-1]){
                    right--;
                    
                }
                    ArrayList<Integer> curr= new ArrayList<>();
                    curr.add(nums[i]);
                    curr.add(nums[left]);
                    curr.add(nums[right]);
                    ans.add(curr);
                    left++;
                    right--;
                }

            }
            
        }
        return ans;
    }
}