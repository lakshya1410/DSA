class Solution {
    public String removeDuplicateLetters(String s) {
        
        int [] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        boolean[] vis = new boolean[26];
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){

             freq[ch - 'a']--;
            if(vis[ch-'a']) continue;

            while(!st.isEmpty() && freq[st.peek()-'a']>0 && st.peek() > ch){
                vis[st.pop()-'a']=false;
            }
            st.push(ch);
            vis[ch-'a']=true;
        }
        StringBuilder ans = new StringBuilder();
        for(char ch : st){
            ans.append(ch);
        }
        return ans.toString();
    }
}