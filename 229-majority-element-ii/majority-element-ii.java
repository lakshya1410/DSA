class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        int n=nums.length;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>(n/3)) arr.add(entry.getKey());
        }
        return arr;
    }
}