public class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }
        
        Map<Character, String> mp = new HashMap<>();
        mp.put('2', "abc");
        mp.put('3', "def");
        mp.put('4', "ghi");
        mp.put('5', "jkl");
        mp.put('6', "mno");
        mp.put('7', "pqrs");
        mp.put('8', "tuv");
        mp.put('9', "wxyz");
        
        List<String> ans = new ArrayList<>();
        cal(digits, 0, "", mp, ans);
        return ans;
    }
    
    public void cal(String digits, int idx, String str, Map<Character, String> mp, List<String> ans) {
        if (idx == digits.length()) {
            if (!str.isEmpty()) {
                ans.add(str);
            }
            return;
        }
        
        String letters = mp.get(digits.charAt(idx));
        for (char letter : letters.toCharArray()) {
            cal(digits, idx + 1, str + letter, mp, ans);
        }
    }
}