class Solution {
    public int longestMountain(int[] arr) {
        int cnt = 0;
        int ans = 0;
        int n = arr.length;
        for(int i=1;i<n-1;i++){
            int j= i;
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                cnt = 1;
                while(j>0 && arr[j]>arr[j-1] ){
                    cnt++;
                    j--;
                }
                j=i;
                while(j<n-1 && arr[j]>arr[j+1]){
                    cnt++;
                    j++;
                }
                ans = Integer.max(ans,cnt);
            }
            
        }return ans;
    }
}