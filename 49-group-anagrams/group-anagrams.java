class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,LinkedList<String>> map= new HashMap<>();
        for(String s : strs){
            char [] chararray=s.toCharArray();
            Arrays.sort(chararray);
            String news=new String(chararray);
            if(!map.containsKey(news)){
                map.put(news,new LinkedList<>());
            }
            map.get(news).add(s);
        }
        return new LinkedList<>(map.values());
    }
}