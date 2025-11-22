    class Pair{
        int val;
        int idx;

        public Pair(int val,int idx){
            this.val = val;
            this.idx = idx;
        }
    }
class Solution {
    public int[] dailyTemperatures(int[] arr) {
        Stack<Pair> st = new Stack<>();
        int[] ans = new int[arr.length] ;
        for(int i = arr.length-1;i>=0;i--){
            while(st.empty()==false && st.peek().val<=arr[i]){
            st.pop();
        }
        if(st.empty()==true){
            ans[i] = 0;
        }else{
            ans[i] =  st.peek().idx - i;
        }
        Pair p = new Pair(arr[i],i);
        st.push(p);
        }
        return ans;
    }
}