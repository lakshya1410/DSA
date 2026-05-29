class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int num : nums){
            min=Math.min(min,sum(num));
        }
        return min;
    }
    int sum(int num){
        int s=0;
        while(num>0){
            s+=num%10;
            num=num/10;
        }
        return s;
    }
}