class Solution {
    public void wiggleSort(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int [] sor = Arrays.copyOf(nums,n);
        int j=n-1;
        for(int i=1;i<n;i+=2){
            nums[i]=sor[j];
            j--;
        }
        int t=0;
        if(n%2==0){
            for(int i=n-2;i>=0;i-=2){
                nums[i]=sor[t];
                t++;
            }
        }else{
            for(int i=n-1;i>=0;i-=2){
                nums[i]=sor[t];
                t++;
            } 
        }
       
    }
}