class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int len=nums.length;
        int n=len/2;
        for (int key : map.keySet()) {
            if (map.get(key) == n) {
                return key;
            }
        }
        return -1
        ;
    }
}