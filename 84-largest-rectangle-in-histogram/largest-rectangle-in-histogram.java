class Solution {
    public int largestRectangleArea(int[] ht) {
        int n=ht.length;
        int [] left = new int [n];
        int [] right= new int [n];
        int maxarea=0;
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && ht[st.peek()]>=ht[i]){
                st.pop();
            }
           right[i]=st.isEmpty() ? n : st.peek();
           st.push(i);
        }
        Stack<Integer> st1 = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st1.isEmpty() && ht[st1.peek()]>=ht[i]){
                st1.pop();
            }
           left[i]=st1.isEmpty() ? -1 : st1.peek();
           st1.push(i);
        }
        for(int i=0;i<n;i++){
            int width=right[i]-left[i]-1;
            int area=ht[i]*width;
            maxarea=Math.max(maxarea,area);
        }
        return maxarea;

    }
}