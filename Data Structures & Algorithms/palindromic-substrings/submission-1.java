class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        Boolean[][] dp = new Boolean[n][n];
        int res = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(func(s , i , j , dp)) res++;
            }
        }
        return res;
    }
    static boolean func(String s , int i , int j , Boolean[][] dp)
    {
        if(i>=j) return true;
        if(dp[i][j] != null) return dp[i][j];
        if(s.charAt(i) != s.charAt(j)) return dp[i][j] = false;
        else return dp[i][j] = func(s , i+1 , j-1 , dp);
    }
}
