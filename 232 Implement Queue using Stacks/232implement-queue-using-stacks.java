class MyQueue {

    Stack<Integer> ip = new Stack<>();
    Stack<Integer> op = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        if(empty()==true){
             int peekEle = x;
        }
        ip.push(x);
    }
    
    public int pop() {
        if(op.empty()==true){
        while(ip.empty()!=true){
            op.push(ip.peek());
            ip.pop();
        }
            int ans = op.peek();
            op.pop();
            return ans;
        }
        int ans = op.peek();
        op.pop();
        return ans;
    }
    
    public int peek() {
       if(op.empty()==true){
        while(ip.empty()!=true){
            op.push(ip.peek());
            ip.pop();
        }
        }
       
       return op.peek();
    }
    
    public boolean empty() {
        if(ip.empty()==true && op.empty()==true){
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */