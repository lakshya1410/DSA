class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

       // int count[]= new int[26];
       HashMap<Character,Integer> map = new HashMap<>();


        for(char ch: s.toCharArray()){
           // count[ch-97]++;
           map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch : t.toCharArray()){
            //count[ch-97]--;
           if (!map.containsKey(ch)) return false;

            map.put(ch, map.get(ch) - 1);

            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        // for(int val: count)
        // if(val!=0) return false;

        // return true;
         return map.isEmpty();
    }

}