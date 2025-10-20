class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        for(int i=0;i<operations.length;i++){
            String s = operations[i];
            if(s.equals("++X") || s.equals("X++")) ans+=1;
            else ans-=1;
        }
        return ans;
    }
}