class Solution {
    class Pair{
        double dist;
        int idx;
        Pair(double d , int i)
        {
            this.dist = d;
            this.idx = i;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->{
            return Double.compare(a.dist,b.dist);
        });
        int idx = 0;
        for(int[] arr : points)
        {
            int x = arr[0];
            int y = arr[1];
            double dist = Math.sqrt((x*x)+(y*y));
            Pair p = new Pair(dist,idx);
            pq.offer(p);
            idx++;
        }
        int[][] ans = new int[k][2];
        int z = 0;
        for(int i=1;i<=k;i++)
        {
            Pair p = pq.poll();
            int index = p.idx;
            ans[z][0] = points[index][0];
            ans[z++][1] = points[index][1];
        }
        return ans;

    }
}
