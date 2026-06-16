class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int [] ans = new int[n1+n2];
        int i=0,j=0;
        int k=0;
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                ans[k]=nums1[i];
                i++;
                
            }
            else{
                ans[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            ans[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n2){
            ans[k]=nums2[j];
            j++;
            k++;
        }
      int left=0;
      int right=n1+n2-1;
      int mid=left+(right-left)/2;
      if((n1+n2)%2!=0){
        return (double)ans[mid];

      }else{
        return ((double)(ans[mid]+ans[mid+1])/2);
      }
        
    }
}