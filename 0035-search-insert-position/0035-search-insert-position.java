class Solution {
    public int searchInsert(int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        int l=0;
        int r=1;
        while(r<arr.length ){
            if(arr[l]<=target && arr[r]>target){
                return l+1;
            }
            l++;
            r++;
        }
        return arr[0]>=target? 0:arr.length;
    }
}