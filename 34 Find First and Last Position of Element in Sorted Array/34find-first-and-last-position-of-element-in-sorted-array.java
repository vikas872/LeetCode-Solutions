class Solution {
    public static int first(int[] arr, int target){
            int n = arr.length;
            int low = 0;
            int high = n-1;
            int f = -1;
            while(low<=high){
                int mid = (low+high)/2;
                if(arr[mid]==target){
                    f = mid;
                    high = mid-1;
                }
                else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            }
            return f;
        }

        public static int last(int[] arr, int target){
            int n = arr.length;
            int low = 0;
            int high = n-1;
            int l = -1;
            while(low<=high){
                int mid = (low+high)/2;
                if(arr[mid] ==target){
                    l = mid;
                    low = mid+1;
                }
                else if(arr[mid]<target){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
                
            }
            return l;
        }
    public int[] searchRange(int[] arr, int target) {
        int f = first(arr,target);
        int l = last(arr,target);
         if(f==-1){
            return new int[]{-1,-1};
         }
        int[] ans = {f,l};
        return ans;
    }     
}
