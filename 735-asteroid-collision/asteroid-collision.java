class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int ast : asteroids){

            boolean isalive=true;

            while(isalive && !st.isEmpty() && st.peek()>0 && ast<0){

                if(Math.abs(st.peek())<Math.abs(ast)){
                    st.pop();
                }
                else if(Math.abs(st.peek())==Math.abs(ast)){
                    st.pop();
                    isalive=false;
                }
                else{
                    isalive=false;
                }
            }
            if(isalive){
                st.push(ast);
            }
        }

        int [] ans= new int[st.size()];
        for(int i= ans.length-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}