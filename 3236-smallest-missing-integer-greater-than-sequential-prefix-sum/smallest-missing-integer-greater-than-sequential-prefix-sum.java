class Solution {
    public int missingInteger(int[] nums) {
        int i=1;
        int n=nums.length;
        if(n==1) return nums[0]+1;
        while(i<n){
            if(nums[i]!=nums[i-1]+1) break;
            i++;
        }
        
        int sum=0;
        for(int j=0;j<i;j++){
            sum+=nums[j];

        }
        while(con(nums,sum)){
            sum++;
        }
       
        return sum;
    }
    boolean con(int [] nums,int tar){
        for(int num : nums){
            if(num==tar) return true;
        }
        return false;
    }
}