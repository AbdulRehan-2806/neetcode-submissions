class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int n : stones)
        {
            pq.offer(n);
        }
        while(pq.size()>1)
        {
            int s1 = pq.poll();
            int s2 = pq.poll();
            if(s1-s2 > 0) pq.offer(s1-s2);
        }
        return pq.size() == 0 ? 0 : pq.poll();
    }
}
