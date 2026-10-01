class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        return func(n , nums , ans);
    }
    static int func(int n , int[] arr , int[] ans)
    {
        int k = 0;
        int sz = 1;
        ans[0] = arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>ans[sz-1]){
                ans[sz] = arr[i];
                sz++;
            }
            else{
                int idx = ceil(sz,ans,arr[i]);
                if(idx != -1)
                ans[idx] = arr[i];
            }
        }
        return sz;
    }
    static int ceil(int n , int[] arr , int k)
    {
        int lo = 0 , hi = n-1;
        while(lo<hi)
        {
            int m = lo + (hi-lo)/2;
            if(arr[m] >= k){
                hi = m;
            }
            else{
                lo = m+1;
            }
        }
        return lo;
    }
}
