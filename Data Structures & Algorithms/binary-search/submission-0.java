class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = -1;
        int lo = 0 , hi = n-1;
        while(lo<=hi)
        {
            int m = lo + (hi-lo)/2;
            if(nums[m] == target) return m;
            else if(nums[m]<target) lo = m+1;
            else hi = m-1;
        }
        return ans;
    }
}
