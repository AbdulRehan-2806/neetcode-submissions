class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        if (n > s2.length()) return false;
       HashMap<Character,Integer> h1 = new HashMap<>();
       for(char c : s1.toCharArray())
       {
            h1.put(c,h1.getOrDefault(c,0)+1);
       }
       HashMap<Character,Integer> h2 = new HashMap<>();
       for(int i=0;i<n;i++)
       {
            char c = s2.charAt(i);
            h2.put(c,h2.getOrDefault(c,0)+1);
       }
       if(h1.equals(h2)) return true;
       for(int i=n;i<s2.length();i++)
       {
            h2.put(s2.charAt(i-n),h2.get(s2.charAt(i-n))-1);
            if(h2.get(s2.charAt(i-n)) <= 0) h2.remove(s2.charAt(i-n));
            char c = s2.charAt(i);
            h2.put(c,h2.getOrDefault(c,0)+1);
            if(h1.equals(h2)) return true;
       }
       return false;
    }
}
