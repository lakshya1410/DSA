class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<num.length();i++){
            char digit = num.charAt(i);
            while(!st.isEmpty()&& k>0 && st.peek() > digit){
                st.pop();
                k--;
            }
            st.push(digit);
                   }
                   while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }
         StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.insert(0, st.pop());
        }
        
      
        while (result.length() > 0 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }
        
        if (result.length() == 0) {
    return "0";
} else {
    return result.toString();
}
    }
    
}