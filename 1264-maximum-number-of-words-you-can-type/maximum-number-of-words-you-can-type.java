class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count = 0;
        
        for (String word : words) {
            boolean canType = true;
            for (int j = 0; j < brokenLetters.length(); j++) {
                if (word.indexOf(brokenLetters.charAt(j)) != -1) {
                    canType = false;
                    break;
                }
            }
            if (canType) count++;
        }
        
        return count;
    }
}
