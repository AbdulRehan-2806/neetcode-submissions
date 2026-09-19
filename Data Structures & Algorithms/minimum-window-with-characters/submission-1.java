class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        String res = "";
        HashMap<Character,Integer> h1 = new HashMap<>();
        for(char c : t.toCharArray())
        {
            h1.put(c,h1.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer> h2 = new HashMap<>();
        int left = 0;
        int min = Integer.MAX_VALUE;
        for(int right = 0 ; right < n ; right++)
        {
            char c = s.charAt(right);
            if(h1.containsKey(c))
            {
                h2.put(c,h2.getOrDefault(c,0)+1);
            }
            while(left < n && isValid(h1,h2))
            {
                c = s.charAt(left);
                if((left<n && right<n) && right-left+1 < min)
                {
                    res = s.substring(left,right+1);
                    min = right-left+1;
                }
                if(h2.containsKey(c))
                {
                    h2.put(c,h2.get(c)-1);
                    if(h2.get(c) == 0) h2.remove(c);
                }
                left++;
            }
        }
        return res;
    }
    static boolean isValid(HashMap<Character,Integer> h1 , HashMap<Character,Integer> h2)
    {
        if(h2.size() < h1.size()) return false;
        for(char k : h1.keySet())
        {
            if(!h2.containsKey(k) || h2.get(k) < h1.get(k)) return false;
        }
        return true;
    }
}
