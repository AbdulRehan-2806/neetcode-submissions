class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n<2) return nums[0];
        int[] dp = new int[n+1];
        Arrays.fill(dp , -1);
        int res1 = func(nums , n , dp , 1);
        Arrays.fill(dp , -1);
        int res2 = func(nums , n-1 , dp , 0);
        return Math.max(res1,res2);
    }
    static int func(int[] nums , int n , int[] dp , int idx)
    {
        if(idx >= n) return 0;
        if(dp[idx] != -1) return dp[idx];
        int pick = nums[idx] + func(nums , n , dp , idx+2);
        int notpick = func(nums , n , dp , idx+1);
        return dp[idx] = Math.max(pick , notpick);
    }
}
