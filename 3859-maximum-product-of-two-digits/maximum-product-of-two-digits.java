class Solution {
    public int maxProduct(int n) {
       ArrayList<Integer> arr = new ArrayList<>();
       while(n>0){
        int r=n%10;
        arr.add(r);
        n=n/10;
       }
       int max=Integer.MIN_VALUE;
       for(int i=0;i<arr.size();i++){
        for(int j=i+1;j<arr.size();j++){
            max=Math.max(max,arr.get(i)*arr.get(j));
        }
       }
       return max;
    }
}