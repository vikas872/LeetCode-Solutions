class CustomStack {
    int[] st;
    int[] inc;
    int last;
    public CustomStack(int maxSize) {
        st = new int[maxSize];
        inc = new int[maxSize];
        last = -1;
    }
    
    public void push(int x) {
        if(last<st.length-1){
            st[last+1] = x;
            last++;
        }
    }
    
    public int pop() {
        if(last==-1){
            return -1;
        }
        int ans = st[last] + inc[last];
        if(last>0){
            inc[last-1]+=inc[last];
        }
        inc[last] = 0;
        last--;
        return ans;
    }
    
    public void increment(int k, int val) {
        if(last==-1){
            return;
        }
        int ind = Math.min(k-1,last);
        inc[ind] += val;
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */