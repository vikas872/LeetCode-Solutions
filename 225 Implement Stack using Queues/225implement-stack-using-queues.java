class MyStack {
        Queue<Integer> Q1 = new LinkedList<>();
        Queue<Integer> Q2 = new LinkedList<>();
    public MyStack() {

    }
    public void swap(Queue Q1, Queue Q2){
        while(Q1.isEmpty()==false){
            Q2.add(Q1.peek());
            Q1.remove();
        }

    }

    
    public void push(int x) {
        if(Q1.isEmpty()==true){
            Q1.add(x);
        }
        else{
            swap(Q1,Q2);
            Q1.add(x);
            swap(Q2,Q1);
        }
    }
    
    public int pop() {
        int x = Q1.peek();
        Q1.remove();
        return x;
    }
    
    public int top() {
        return Q1.peek();
    }
    
    public boolean empty() {
        return Q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */