class Solution {
    class Pair{
        int num;
        int freq;
        Pair(int n , int f)
        {
            this.num = n;
            this.freq = f;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Pair> pq = new PriorityQueue<>(
        (a, b) -> Integer.compare(b.freq, a.freq));
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : nums)
            hm.put(num,hm.getOrDefault(num,0)+1);
        for(int key : hm.keySet())
        {
            Pair p = new Pair(key,hm.get(key));
            pq.offer(p);
        }
        int[] ans = new int[k];
        for(int i=1;i<=k;i++)
            ans[i-1] = pq.poll().num;
        return ans;
    }
}
