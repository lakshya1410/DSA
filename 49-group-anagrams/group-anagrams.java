class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String st : strs){
            char[] arr= st.toCharArray();
            Arrays.sort(arr);
            String s=new String(arr);
            if(map.containsKey(s)){
                map.get(s).add(st);
            }else{
               List<String> list = new ArrayList<>();
                list.add(st);
                map.put(s, list);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}