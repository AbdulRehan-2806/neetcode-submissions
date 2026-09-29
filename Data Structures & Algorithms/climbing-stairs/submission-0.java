class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp , -1);
        return func(n , dp , 0);
    }
    static int func(int n , int[] dp , int idx)
    {
        if(idx > n) return 0;
        if(idx == n) return 1;
        if(dp[idx] != -1) return dp[idx];
        return dp[idx] = func(n,dp,idx+1) + func(n,dp,idx+2);
    }
}
