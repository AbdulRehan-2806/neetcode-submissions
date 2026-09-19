class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] a = new int[heights.length];
        int[] b = new int[heights.length];
        a = NSE(heights);
        b = PSE(heights);
        int ans = 0;
        for(int i=0;i<heights.length;i++)
        {
            ans = Math.max(ans , heights[i] * (a[i]-b[i]-1));
        }
        return ans;
    }
    static int[] NSE(int[] arr)
    {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            while(! st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
            ans[i] = st.isEmpty() ? arr.length : st.peek();
            st.push(i);
        }
        return ans;
    }
    static int[] PSE(int[] arr)
    {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(! st.isEmpty() && arr[st.peek()] > arr[i]) st.pop();
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return ans;
    }
}