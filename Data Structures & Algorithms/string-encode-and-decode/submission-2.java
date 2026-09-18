class Solution {

    public String encode(List<String> strs) {
        int n = strs.size();
        if(n==0) return "<<";
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<n;i++)
        {
            String s = strs.get(i);
            if(s.equals("")) sb.append("<-");
            else sb.append(s);
            if(i != (n-1)) sb.append("->");
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        String[] s = str.split("->");
        List<String> strs = new ArrayList<>();
        for(String st : s)
        {
            if(st.equals("->") || st.equals("<<")) continue;
            if(st.equals("<-")) strs.add("");
            else strs.add(st);
        }
        return strs;
    }
}
