class Solution {
    public int[][] intervalIntersection(int[][] a, int[][] b) {
        List<int[]> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<a.length && j<b.length){
            int s = Math.max(a[i][0],b[j][0]);
            int e = Math.min(a[i][1],b[j][1]);
            if(s<=e){
                list.add(new int[] {s,e});
            }
            if(a[i][1]>b[j][1]){
                j++;
            }
            else{
                i++;
            }
        }
        return list.toArray(new int[list.size()][2]);
    }
}