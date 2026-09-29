class Solution {
    static StringBuilder res;
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n<=1) return s;
        res = new StringBuilder("");
        for(int i=1;i<n;i++)
        {
            expand(s , i , i);
            expand(s , i-1 , i);
        }
        return res.toString();
        
    }
    static void expand(String s , int i , int j)
    {
        StringBuilder sb = new StringBuilder("");
        while(i>=0 && j<s.length())
        {
            if(s.charAt(i) != s.charAt(j)) break;
            i--;
            j++;
        }
        int len = j-i-1;
        if(len > res.length()) 
            res = new StringBuilder(s.substring(i+1,j));
    }
}
