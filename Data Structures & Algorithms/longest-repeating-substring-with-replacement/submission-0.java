class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int ans = 0;
        HashMap<Character,Integer> hm = new HashMap<>();
        int maxfreq = 0;
        int left = 0;
        for(int i=0;i<n;i++)
        {
            char c = s.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
            maxfreq = Math.max(maxfreq , hm.get(c));
            int len = i-left+1;
            if(len-maxfreq > k)
            {
                char ch = s.charAt(left);
                if(hm.get(ch) == 1) hm.remove(ch);
                else hm.put(ch,hm.get(ch)-1);
                left++;
            }
            ans = Math.max(ans , i-left+1);
        }
        return ans;
    }
}
