class Solution {
    public double myPow(double x, long n) {
        if(n<0){
            x=1/x;
            n=-n;

        }
        return help(x,n);

    }
    double help(double x,long n){
        if(n==0) return 1.0;
        double half=help(x,n/2);
        if(n%2==0) return half*half;
        else return half*half*x;
    }
}