class CustomStack {
    ArrayList<Integer> list;
    int currInd = -1;
    int max;

    public CustomStack(int maxSize) {
         max = maxSize;
        list = new ArrayList<>();

    }

    public void push(int x) {
        if (currInd < max - 1) {
            currInd++;
            list.add(x);
        } else {
            
        }
    }

    public int pop() {
        if (list.size() == 0) {
            return -1;
        } else {
            currInd--;
            int val = list.get(list.size()-1);
            list.remove(list.size()-1);
            return val;
        }
    }

    public void increment(int k, int val) {
        if (k > currInd) {
            for (int i=0;i< list.size();i++) {
                list.set(i, list.get(i) + val);
            }
        } else {
            for (int i = 0; i < k; i++) {
                list.set(i, list.get(i) + val);
            }

        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */