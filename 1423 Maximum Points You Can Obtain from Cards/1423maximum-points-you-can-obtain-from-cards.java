class Solution {
    public int maxScore(int[] arr, int k) {
        int lsum = 0;
        int rInd = arr.length-1;
        int rsum = 0;
        int maxSum = 0;
        for(int i = 0;i<=k-1;i++){
            lsum+=arr[i];
        }
        maxSum = lsum;
        for(int i = k-1;i>=0;i--){
            lsum = lsum-arr[i];
            rsum = rsum+arr[rInd];
            rInd--;
            maxSum = Math.max(maxSum, lsum+rsum);
        }
        return maxSum;
    }
}