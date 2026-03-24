class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int max = nums[0];
        for(int i:nums){
            sum+=i;
            max = Math.max(i,max);
        }
        int n = nums.length;
        int val = n*(n+1)/2;
        return val-sum;
    }
}