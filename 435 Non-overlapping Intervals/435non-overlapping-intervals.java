class Solution {
    public int eraseOverlapIntervals(int[][] inter) {
        Arrays.sort(inter,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> list = new ArrayList<>();
        list.add(inter[0]);
        int cnt = 0;
        for(int i=1;i<inter.length;i++){
            int[] curr = inter[i];
            int[] prv = list.get(list.size()-1);
            if(curr[0]<prv[1]){
                cnt++;
                if(curr[1]<prv[1]){
                    prv = curr;
                    list.set(list.size()-1,curr);
                }
            }else{
                list.add(inter[i]);
            }
            
        }
        return cnt;
    }
}