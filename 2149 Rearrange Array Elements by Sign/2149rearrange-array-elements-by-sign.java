class Solution {
    public int[] rearrangeArray(int[] arr) {
        int pos = 0;
        int neg = 1;

        int[] ans = new int[arr.length];
        for(int i:arr){
            if(i<0){
                ans[neg] = i;
                neg = neg+2;
            }
            else{
                ans[pos] = i;
                pos+=2;
            }
        }
        return ans;

        // ArrayList<Integer> pos = new ArrayList<>();
        // ArrayList<Integer> neg = new ArrayList<>();
        // int[] ans = new  int[arr.length];
        // for(int i:arr){
        //     if(i<0){
        //         neg.add(i);
        //     }
        //     else{
        //         pos.add(i);
        //     }
        // }
        // int idx = 0;
        // for(int i = 0;i<neg.size();i++){
        //     ans[idx++] = pos.get(i);
        //     ans[idx++] = neg.get(i);
        // }
        // return ans;
    }
}