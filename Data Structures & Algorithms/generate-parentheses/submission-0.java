class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        func(ans , 2*n , 0 , 0 , 0 , new StringBuilder(""));
        return ans;
    }
    static void func(List<String> al , int n , int open , int close , int idx, StringBuilder sb)
    {
        if(idx == n){
            al.add(sb.toString());
            return ;
        }
        if(open < n/2)
        {
            sb.append("(");
            func(al , n , open+1 , close , idx+1 , sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close < open)
        {
            sb.append(")");
            func(al , n , open , close+1 , idx+1 , sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
