class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        int ans =0;
        // for(int num:nums){
        //      map.put(num, map.getOrDefault(num, 0) + 1);
        // }
      for(int j=0;j<nums.length;j++){
         map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

         while(map.get(nums[j])>k){
            map.put(nums[i],map.get(nums[i])-1);
            i++;
         }
         ans=Math.max(ans,j-i+1);
      }
        return ans;

    
    }
    // boolean valid(int i,int j,int [] nums,HashMap<Integer,Integer> map,int k){
    //     while(i<=j){
    //        if(map.get(nums[i])!=k) return false;
    //        i++; 
    //     }
    //     return true;
    // }
}