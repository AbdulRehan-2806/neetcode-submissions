class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int ans = Integer.MAX_VALUE;
        int lo = 0 , hi = max(piles);
        while(lo<=hi)
        {
            int m = lo+(hi-lo)/2;
            if(possible(piles,m,h)){
                ans = Math.min(ans , m);
                hi = m-1;
            }
            else lo = m+1;
        }
        return ans;
    }
    static int max(int[] arr)
    {
        int m = -1;
        for(int n : arr) m = Math.max(m,n);
        return m;
    }
    static boolean possible(int[] arr , int k , int h)
    {
        int cnt = 0;
        for(int n : arr)
        {
            int hours = (int)(Math.ceil((double)n/k));
            cnt += hours;
            if(cnt > h) return false;
        }
        return cnt <= h;
    }
}
