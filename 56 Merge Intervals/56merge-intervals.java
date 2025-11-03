class Solution {
    public int[][] merge(int[][] inter) {
        Arrays.sort(inter,(a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> ans = new ArrayList<>();
        ans.add(inter[0]);
        if(inter.length==1){
            return inter;
        }
        for(int i=1;i<inter.length;i++){
            int[] curr = inter[i];
            int[] prv = ans.get(ans.size()-1);
            if(curr[0]<=prv[1]){
                prv[1] = Math.max(curr[1],prv[1]);
            }
            else{
                ans.add(inter[i]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}