class Solution {
    public int scoreOfString(String s) {
        int score = 0 , n = s.length();
        for(int i=1;i<n;i++)
        {
            int prev = (int)(s.charAt(i-1));
            int cur = (int)(s.charAt(i));
            int diff = Math.abs(prev-cur);
            score += diff;
        }
        return score;
    }
}