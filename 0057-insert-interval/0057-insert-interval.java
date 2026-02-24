class Solution {
    public int[][] insert(int[][] arr, int[] val) {
        ArrayList<int[]> ans = new ArrayList<>();
        for(int[] in:arr){
            ans.add(in);
        }
        ans.add(val);
        int[][] sorted = new int[ans.size()][];
        sorted = ans.toArray(new int[ans.size()][]);
        Arrays.sort(sorted,(a,b) -> Integer.compare(a[0],b[0]));
        ans.clear();
        ans.add(sorted[0]);
        for(int i=1;i<sorted.length;i++){
            int[] curr = sorted[i];
            int[] prv = ans.get(ans.size()-1);
            if(curr[0]<=prv[1]){
                prv[1] = Math.max(prv[1],curr[1]);
            }
            else{
                ans.add(curr);
            }
        }

        return ans.toArray(new int[ans.size()][]);

    }
}