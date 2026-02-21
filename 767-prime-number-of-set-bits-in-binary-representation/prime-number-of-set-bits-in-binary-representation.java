class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans=0;
        while(left<=right){
            String b = Integer.toBinaryString(left);
            int c=0;
            for(int i=0;i<b.length();i++){
                if(b.charAt(i)=='1') c++;
            }
            if(isPrime(c)) ans++;
            left++;
        }
        return ans;
    }
    boolean isPrime(int n){
    if(n <= 1) return false;  
    
    for(int i = 2; i * i <= n; i++){
        if(n % i == 0) return false;
    }
    
    return true;
}
}