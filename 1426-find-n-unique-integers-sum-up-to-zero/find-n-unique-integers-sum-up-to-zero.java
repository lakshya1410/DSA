class Solution {
    public int[] sumZero(int n) {
        int ans []=new int[n];
        int idx=0;
        if(n%2!=0){ ans[idx]=0;
            idx++;
            n--;        
    }
    for(int i =0;i<n/2;i++){
        ans[idx++]=i+1;
        ans[idx++]=-(i+1);
    }
    return ans;
}
}