class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1= new ArrayList<>();
        ArrayList<Integer> arr2= new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2;i<=nums.length-1;i++){
            if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)) arr1.add(nums[i]);
            else arr2.add(nums[i]); 
        }
        int n=nums.length;
        int[] res= new int[n];
        int i = 0;

        for (int j = 0; j < arr1.size(); j++) {
            res[i] = arr1.get(j);
            i++;
        }

        for (int j = 0; j < arr2.size(); j++) {
            res[i] = arr2.get(j);
            i++;
        }

        return res;

    }
}