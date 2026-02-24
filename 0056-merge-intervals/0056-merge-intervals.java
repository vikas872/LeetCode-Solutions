class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> list = new ArrayList<>();
        int[] curr = arr[0];
        list.add(curr);
        if(arr.length==1){
            return arr;
        }
        for(int i=1;i<arr.length;i++){
            curr = arr[i];
            int[] prv = list.get(list.size()-1);
            if(curr[0]<=prv[1]){
                prv[1] = Math.max(curr[1],prv[1]);
            }else{
                list.add(curr);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}