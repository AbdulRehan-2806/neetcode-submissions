class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp , -1);
        return func(nums , n , dp , 0);
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
