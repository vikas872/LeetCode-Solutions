class Solution {
    public int maxProfit(int[] arr) {
        int buy = arr[0];
        int profit = 0;
        int currProfit = 0;

        for(int i=0;i<arr.length;i++){
            currProfit = arr[i]-buy;
            if(buy>arr[i]){
                buy = arr[i];
            }
            else if(currProfit>profit){
                profit = currProfit;
            }
        }
        return profit;
    }
}