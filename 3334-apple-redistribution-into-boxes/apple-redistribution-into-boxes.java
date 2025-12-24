class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int total=0;
        for(int app : apple){
            total+=app;
        }
        int m=capacity.length;
        int cnt=0;
        int sum=0;
        for(int i=m-1;i>=0;i--){
            if(sum<total) {
                sum+=capacity[i];
                cnt++;
            }
            else{
                break;
            }
        }
        return cnt;
    }
}