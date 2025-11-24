class MinStack {
    Stack<Long> st;
    Long min = Long.MAX_VALUE;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        Long vall = Long.valueOf(val);
        if(st.empty()){
            st.push(vall);
             min = vall;
        }else{
            if(vall<min){
                st.push(2*vall - min);
                min = vall;
            }else{
                st.push(vall);
            }
        }
    }
    
    public void pop() {
        if(st.peek()<min){
            
            min = 2*min - st.pop();
        }else{
            st.pop();
        }
    }
    
    public int top() {
        if(st.peek()<min){
            return min.intValue();
        }
        else{
            return st.peek().intValue();
        }
    }
    
    public int getMin() {
        return min.intValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */