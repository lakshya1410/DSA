class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int pr=1;
        int n1=n;
        while(n1!=0){
            int r=n1%10;
            sum+=r;
            pr*=r;
            n1=n1/10;
        }
        return n%(sum+pr)==0;
    }
}