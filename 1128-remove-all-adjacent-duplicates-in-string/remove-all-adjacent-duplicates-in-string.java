class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char ch = s.charAt(i);
            int li=sb.length()-1;
            if(sb.length() > 0 && sb.charAt(li)==ch) sb.deleteCharAt(li);
           else sb.append(ch);
        }
        return sb.toString();
    }
}