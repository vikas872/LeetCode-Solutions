class Solution {
    public int maxSubArray(int[] arr) {
       
        // int maxSum = Integer.MIN_VALUE;
    //    for(int i=0;i<arr.length;i++){
    //         currSum+=arr[i];
    //         maxSum = Math.max(currSum,maxSum);
    //         if(currSum <0){
    //             currSum = 0;
    //         }
    //    }
    //     for(int i=0;i<arr.length;i++){
    //         int currSum = 0;
    //         for(int j=i;j<arr.length;j++){
    //             currSum+=arr[j];
    //             maxSum = Math.max(currSum,maxSum);
    //         }
    //     }
    // //    return maxSum;
    // int maxSum = Integer.MIN_VALUE;
    // for(int i=0;i<arr.length;i++){
    //     int currSum = 0;
    //     for(int j=i;j<arr.length;j++){
    //         currSum = currSum+arr[j];
    //         maxSum = Math.max(maxSum,currSum);
    //     }
    // }
    // return maxSum;
    int maxSum = arr[0];
    int currSum = arr[0];
    for(int i=1;i<arr.length;i++){
        currSum = Math.max(arr[i], currSum+arr[i]);
        maxSum = Math.max(maxSum,currSum);

    }
    return maxSum;

    }
}
