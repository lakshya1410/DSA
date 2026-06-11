class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int e1=-1;
        int e2=-1;
        int count1=0;
        int count2=0;
        for(int num : nums){
           
             if(num ==e1){
                count1++;
            }
            else if(num==e2){
                count2++;
            }
            else if(count1==0){
                e1=num;
                count1=1;
            }
            else if(count2==0){
                e2=num;
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
         count1=0;
         count2=0;
        for(int num : nums){
            if(num==e1) count1++;
            if(num==e2) count2++;
        }
        int n=nums.length;
        ArrayList<Integer> arr = new ArrayList<>();
        if(count1>(n/3)) arr.add(e1);
        if(count2>(n/3) && e1!=e2) arr.add(e2);

        return arr;
    }
}