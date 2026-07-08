class Solution {
    public int longestValidParentheses(String s) {
        // int n=s.length();
        // int max=0;
        // for(int i=0;i<n-1;i++){
        //     for(int j=n-1;j>i;j--){
        //         String check=s.substring(i,j+1);
        //         if(valid(check)){
        //         max=Math.max(max,check.length());
        //         return max;}
        //     }
        // }
        // return max;
        int left=0;
        int right=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(') left++;
            else right++;
            if(left==right) max=Math.max(max,left*2);
            else if(right>left) {
                left=0;
                right=0;
            }
        }
        left=0;
        right=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='(') left++;
            else right++;
            if(left==right) max=Math.max(max,left*2);
            else if(left>right){
                left=0;
                right=0;
            }
        }
        return max;
    }
    // boolean valid(String s){
    //     Stack<Character> st = new Stack<>();
    //     for(char ch : s.toCharArray()){
    //         if(ch=='(') st.push(ch);
    //         else if(ch==')' &&  !st.isEmpty() && st.peek()=='(' ) st.pop();
    //         else st.push(ch);
    //     }
    //     return st.isEmpty();
    // }
}