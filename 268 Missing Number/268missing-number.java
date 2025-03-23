class Solution {
   
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum = ((n)*(1+n))/2;
        int s=0;
        for(int i=0;i<nums.length;i++){
            s = s+nums[i];
        }
        int missing = sum - s;
        return missing;
    }
}