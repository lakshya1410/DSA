class Solution {
    public int maximumProduct(int[] nums) {
        int n1=Integer.MIN_VALUE;
        int n2=Integer.MIN_VALUE;
        int n3=Integer.MIN_VALUE;

        int m1=Integer.MAX_VALUE;
        int m2=Integer.MAX_VALUE;
        for(int n : nums){
            if(n>n1 ){
                n3=n2;
                n2=n1;
                n1=n;
            }
            else if (n>n2){
                n3=n2;
                n2=n;
            }
            else if(n>n3  ){
                n3=n;
            }
            if (n<m1){
                m2=m1;
                m1=n;
            }else if(n<m2){
                m2=n;
            }

        }
        
        return Math.max( n1*n2*n3,n1*m1*m2);
    }
}