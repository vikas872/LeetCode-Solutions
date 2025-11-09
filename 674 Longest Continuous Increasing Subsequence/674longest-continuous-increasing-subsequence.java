class Solution {
    public int findLengthOfLCIS(int[] arr) {
        int cnt = 1;
        int ans = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                cnt++;
                ans = Math.max(ans,cnt);
            }
            else{
                // ans = Math.max(ans,cnt);
                cnt = 1;
            }
        }
        return ans;
    }
}