class Solution {
    public int search(int[] nums, int k) {
        int n = nums.length;
        int ans = -1;
        int lo = 0 , hi = n-1;
        while(lo<=hi)
        {
            int m = lo + (hi-lo)/2;
            if(nums[m] == k) return m;
            if(nums[lo] <= nums[m])
            {
                if(nums[lo] <= k && k < nums[m])
                {
                    hi = m-1;
                }
                else lo = m+1;
            }
            else if(nums[m] <= nums[hi])
            {
                if(nums[m] < k && k<= nums[hi]) lo = m+1;
                else hi = m-1;
            }
        }
        return ans;
    }
}
