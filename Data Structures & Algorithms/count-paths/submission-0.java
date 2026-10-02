class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++) Arrays.fill(dp[i],-1);
        return func(m , n , dp , m-1 , n-1);
    }
    static int func(int n , int m , int[][] dp , int i , int j)
    {
        if(i==0 && j==0) return 1;
        if(i<0 || j<0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int left = func(n , m , dp , i , j-1);
        int up = func(n , m , dp , i-1 , j);
        return dp[i][j] = up+left;
    }
}
