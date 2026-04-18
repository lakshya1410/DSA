class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int curr=0;
        int currlen=1;
        int maxlen=1;
        int prev=0;
        for(int i=1;i<arr.length;i++){
            curr=Integer.compare(arr[i-1],arr[i]);

            if(curr==0) currlen=1;
            else if(curr*prev==-1) currlen++;
            else currlen=2;

            maxlen=Math.max(currlen,maxlen);
            prev=curr;
        }
        return maxlen;
    }
}