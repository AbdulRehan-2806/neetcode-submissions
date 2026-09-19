class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        HashMap<Character,Integer> hm = new HashMap<>();
        int max = 0;
        int left = 0;
        for(int right=0;right<len;right++)
        {
            char c = s.charAt(right);
            if(hm.containsKey(c) && left <= hm.get(c))
                left = hm.get(c)+1;
            hm.put(c,right);
            max = Math.max(max , right-left+1);
        }
        return max;
    }
}
