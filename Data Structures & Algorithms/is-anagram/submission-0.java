class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> h1 = new HashMap<>();
        HashMap<Character,Integer> h2 = new HashMap<>();
        for(char c : s.toCharArray())
            h1.put(c,h1.getOrDefault(c,0)+1);
        for(char c : t.toCharArray())
            h2.put(c,h2.getOrDefault(c,0)+1);
        return h1.equals(h2);
        
    }
}
