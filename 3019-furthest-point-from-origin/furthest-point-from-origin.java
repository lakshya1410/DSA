class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left=0;
        int right=0;
        int underscore=0;
        for(char ch : moves.toCharArray()){
            if(ch=='L') left++;
            else if(ch=='R') right++;
            else underscore++;

        }
        return Math.abs(right-left)+underscore;
    }
}