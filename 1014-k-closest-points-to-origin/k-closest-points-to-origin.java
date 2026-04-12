class pair{
    int x;
    int y;
    pair(int x, int y){
        this.x=x;
        this.y=y;
    }
}


class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<pair> pq= new PriorityQueue<>( (a, b) -> (a.x * a.x + a.y * a.y) - (b.x * b.x + b.y * b.y));

        for( int i=0;i<points.length;i++){
                pq.add(new pair(points[i][0],points[i][1]));
            }
            int [][] ans= new int[k][2];
            int i=0;
            while(i<k){
               pair p = pq.poll();
                ans[i][0] = p.x;
                ans[i][1] = p.y;
                i++;
            }
            return ans;

        }
    }
