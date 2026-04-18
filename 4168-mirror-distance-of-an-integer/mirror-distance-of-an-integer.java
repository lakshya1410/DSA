class Solution {
    public int mirrorDistance(int n) {
        int num=reverse(n);
        return Math.abs(n-num);
    }
    int reverse(int n){
        int rev=0;
        while(n>0){
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev;
    }
}