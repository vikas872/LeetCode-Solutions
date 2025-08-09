class Solution {
    public int maxProfit(int[] arr) {
        // int max = 0;
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j = i+1;j<arr.length;j++){
                
        //        int currPro = arr[j] - arr[i];
        //        max = Math.max(currPro,max);

        //     }
        // }
        // return max;
        int minPrice = Integer.MAX_VALUE;
        // int minPrice=0;
        int profit = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minPrice){
                minPrice = arr[i];
            }else{
                profit = Math.max(profit,arr[i] - minPrice);
            }
        }
        return profit;
    }
}