class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]==target-arr[i]){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1};
    }
}