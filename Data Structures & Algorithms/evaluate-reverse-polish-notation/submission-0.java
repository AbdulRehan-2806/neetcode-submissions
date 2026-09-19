class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        int n  = tokens.length;
        for(String s : tokens)
        {
            if(("+-*/").contains(s)){
                int num2 = Integer.parseInt(st.pop());
                int num1 = Integer.parseInt(st.pop());
                if(s.equals("+")) st.push(Integer.toString(num1+num2));
                else if(s.equals("-")) st.push(Integer.toString(num1-num2));
                else if(s.equals("*")) st.push(Integer.toString(num1*num2));
                else if(s.equals("/")) st.push(Integer.toString(num1/num2));
            }
            else st.push(s);
        }
        return Integer.parseInt(st.pop());
    }
}
