class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> map = new HashMap<>();
        int n=s.length();
        for(List<String> l : knowledge){
            map.put(l.get(0),l.get(1));
        }
       StringBuilder ans = new StringBuilder();
       for(int i=0;i<n;i++){
        if(s.charAt(i)=='('){
            int j = s.indexOf(')',i);
            String str = s.substring(i+1,j);
            if(map.containsKey(str)){
                ans.append(map.get(str));
            }else{
                ans.append('?');
            }
            i=j;
        }else
        ans.append(s.charAt(i));
       }
       return ans.toString();
    }
}