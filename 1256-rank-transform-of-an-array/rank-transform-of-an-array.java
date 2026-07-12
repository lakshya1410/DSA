class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int [] copy=new int[n];
        for(int i=0;i<n;i++){
            copy[i]=arr[i];
        }
        Arrays.sort(copy);
        HashMap<Integer,Integer> map = new HashMap<>();
        int id=1;
        for(int i : copy){
            if(!map.containsKey(i)){
                map.put(i,id++);
            }
        }
        int ans[]= new int[n];
        for(int i=0;i<n;i++){
            ans[i]=map.get(arr[i]);
        }
        return ans;
    }
}