class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int cnt=0;
        int i=0;

        while(coins>0 && i< costs.length){
            if(costs[i]<=coins){
                cnt++;
                coins-=costs[i];
            }
            i++;
        }
        return cnt;
    }
}