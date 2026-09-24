class KthLargest {
    static PriorityQueue<Integer> pq;
    static int K;
    public KthLargest(int k, int[] nums) {
        K = k;
        pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int n : nums) pq.offer(n);
    }
    
    public int add(int val) {
        pq.offer(val);
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<K;i++) list.add(pq.poll());
        int ans = pq.peek();
        for(int n : list) pq.offer(n);
        return ans;
    }
}
