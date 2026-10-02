class Solution {
    void help(int open,int close,String curr,List<String> ans){
        if(close==0 && open==0) {
            ans.add(curr);
            return ;
        }
        if(open!=0) {
            help(open-1,close,curr+'(',ans);
        }
        if(close>open){
            help(open,close-1,curr+')',ans);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans= new ArrayList<>();
        help(n,n,"",ans);
        return ans;
    }
}