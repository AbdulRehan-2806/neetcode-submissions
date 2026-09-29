class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp , -1);
        return Math.min(func(cost , n , dp , 0),func(cost,n,dp,1));
    }
    static int func(int[] cost , int n , int[] dp , int idx)
    {
        if(idx == n) return 0;
        if(idx > n) return (int)1e9;
        if(dp[idx] != -1) return dp[idx];
        return dp[idx] = cost[idx] + Math.min(func(cost , n , dp , idx+1) , func(cost , n , dp , idx+2));
    }
}
