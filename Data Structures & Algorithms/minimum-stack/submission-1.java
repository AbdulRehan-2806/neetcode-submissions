class MinStack {
    static Stack<Integer> st;
    static PriorityQueue<Integer> pq;
    public MinStack() {
        st = new Stack<>();
        pq = new PriorityQueue<>();
    }
    
    public void push(int val) {
        st.push(val);
        pq.offer(val);
    }
    
    public void pop() {
        List<Integer> al = new ArrayList<>();
        while(!st.peek().equals(pq.peek())) al.add(pq.poll());
        pq.poll();
        for(int num : al) pq.offer(num);
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return pq.peek();
    }
}
