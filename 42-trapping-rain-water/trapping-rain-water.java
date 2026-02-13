class Solution {
    public int trap(int[] arr) {
        int n= arr.length;
        int []leftmax= new int[n];
        int[] rightmax= new int[n];
        leftmax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);

        }
        rightmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],arr[i]);
        }

        int ans=0;
        for(int i=0;i<n;i++){
            ans+=Math.min(rightmax[i],leftmax[i])-arr[i];
        }
        return ans;
    }
}