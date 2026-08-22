class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int n1 : nums1){
            for(int n2 : nums2){
                if(n1==n2) set.add(n1);
            }
        }
       List<Integer> list = new ArrayList<>(set);
        int [] ans = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]= list.get(i);
        }
        return ans;
    }
}