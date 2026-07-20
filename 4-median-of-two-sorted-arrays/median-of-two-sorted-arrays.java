class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int merge[]= new int[n1+n2];
        int i=0;
        int j=0;
        int id=0;
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                merge[id]=nums1[i];
                i++;
                id++;
            }
            else{
                merge[id]=nums2[j];
                j++;
                id++;
            }
        }
        while(i<n1){
            merge[id]=nums1[i];
            i++;
            id++;
        }
        while(j<n2){
            merge[id]=nums2[j];
            j++;
            id++;
        }
        
        int len = n1 + n2;
        int mid = len / 2;
         if (len % 2 != 0) {
            return merge[mid];
        } else {
            return (merge[mid - 1] + merge[mid]) / 2.0;
        }
    }
}