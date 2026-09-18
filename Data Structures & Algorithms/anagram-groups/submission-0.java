class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        for(String w : strs)
        {
            char[] c = w.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            if(!hm.containsKey(sorted)) hm.put(sorted,new ArrayList<>());
            hm.get(sorted).add(w);
        }
        return new ArrayList<>(hm.values());
    }
}
