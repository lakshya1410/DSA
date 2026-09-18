class Solution {
    public int leastInterval(char[] tasks, int n) {
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int [] freq= new int[26];
        for(char ch : tasks){
            freq[ch-'A']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>0) pq.offer(freq[i]);
        }
        int time=0;
        while(!pq.isEmpty()){
            ArrayList<Integer> temp = new ArrayList<>();
        
        for(int i=1;i<=n+1;i++){
            if(!pq.isEmpty()){
                int f=pq.poll();
                f--;
                temp.add(f);
            }
        }
        for(int f: temp){
            if(f>0) pq.offer(f);
        }
        if(pq.isEmpty()) {
            time+=temp.size();
        }else{
            time+=n+1;
        }
        }
        return time;
    }
}