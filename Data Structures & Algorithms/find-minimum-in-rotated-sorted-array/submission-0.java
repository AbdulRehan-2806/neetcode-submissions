class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int lo = 0 , hi = n-1;
        while(lo<=hi)
        {
            int m = lo + (hi-lo)/2;
            if(nums[lo] <= nums[m])
            {
                min = Math.min(min,nums[lo]);
                lo = m+1;
            }
            else
            {
                min = Math.min(min,nums[m]);
                hi = m-1;
            }
        }
        return min;
    }
}
