class Solution {
    public int[] twoSum(int[] arr, int val) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int comp = val-arr[i];
            if(map.containsKey(comp)){
                return new int[]{i, map.get(comp)};
            }else{
                map.put(arr[i], i);
            }
        }
        return new int[]{-1};
    }
}