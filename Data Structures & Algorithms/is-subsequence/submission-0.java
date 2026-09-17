class Solution {
    static int[][] dp;
    public boolean isSubsequence(String s, String t) {
        dp = new int[s.length()+1][t.length()+1];
        for(int i=0;i<=s.length();i++)
            Arrays.fill(dp[i],-1);
        int len = lcs(s,t,s.length(),t.length());
        return len == s.length();
    }
    static int lcs(String s , String t , int i , int j)
    {
        if(i==0 || j==0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(s.charAt(i-1) == t.charAt(j-1))
                dp[i][j] =  1+lcs(s,t,i-1,j-1);
        else dp[i][j] = Math.max(lcs(s,t,i-1,j) , lcs(s,t,i,j-1));
        return dp[i][j];
    }
}