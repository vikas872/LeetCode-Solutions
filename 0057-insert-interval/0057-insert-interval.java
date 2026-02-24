class Solution {
    public int[][] insert(int[][] inter, int[] newI) {
        List<int[]> sorted = new ArrayList<>();
        for(int[] in:inter){
            sorted.add(in);
        }
        sorted.add(newI);
        // int[][] arr = new int[inter.length+1][2];
        // arr = sorted.toArray();
        int[][] arr = sorted.toArray(new int[sorted.size()][]);
        Arrays.sort(arr,(a,b) -> Integer.compare(a[0],b[0]));
        sorted.clear();
        sorted.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            int[] curr = arr[i];
            int[] prv = sorted.get(sorted.size()-1);
            if(curr[0]<=prv[1]){
                prv[1] = Math.max(curr[1],prv[1]);
            }
            else{
                sorted.add(curr);
            }
        }
        return sorted.toArray(new int[sorted.size()][]);

    }
}