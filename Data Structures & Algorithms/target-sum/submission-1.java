class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        for(int num : nums) sum += num;
        int m = (sum-target)/2;
        if((sum - target < 0 || m<0) || (sum-target)%2 == 1) return 0;
        int[][] dp = new int[n+1][m+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(i==0) dp[i][j] = 0;
            }
        }
        dp[0][0] = 1;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(nums[i-1] <= j)
                    dp[i][j] = dp[i-1][j-nums[i-1]] + dp[i-1][j];
                else dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][m];
    }
}
