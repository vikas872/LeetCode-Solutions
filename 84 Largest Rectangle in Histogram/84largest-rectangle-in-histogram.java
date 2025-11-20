class Solution {
    public int[] nse(int[] arr){
        Stack <Integer> st = new Stack<>();
        int[] val = new int[arr.length]; 
        // HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=arr.length-1;i>=0;i--){
            while(st.empty()==false && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(st.empty()==true){
                // map.put(i,-1);
                val[i] = arr.length;
            }else{
                val[i] = st.peek();
            }
            st.push(i);

        }
        return val;
    }

    public int[] pse(int[] arr){
        Stack <Integer> st = new Stack<>();
        int[] val = new int[arr.length]; 

        // HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<=arr.length-1;i++){
            while(st.empty()==false && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(st.empty()==true){
                val[i] = -1;
            }else{
                val[i] = st.peek();
            }
            st.push(i);

        }
        return val;
    }
    public int largestRectangleArea(int[] arr) {
        int[] ps = pse(arr);
        int[] ns = nse(arr);
        int ans = 0;
        for(int i = 0;i<arr.length;i++){
        int area = arr[i] * (ns[i] - ps[i] - 1);
            ans = Math.max(ans,area);
        }
        return ans;
    }
}