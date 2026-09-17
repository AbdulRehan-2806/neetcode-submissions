class Solution {
    public int appendCharacters(String s, String t) {
        int n = s.length();
        int m = t.length();
        int len = func(s,t,n,m);
        return len;
    }
    static int func(String s , String t , int n , int m)
    {
        int i=0,j=0;
        while(i<n && j<m)
        {
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }
            else i++;
        }
        if(j == m) return 0;
        return m-j;
    }
}