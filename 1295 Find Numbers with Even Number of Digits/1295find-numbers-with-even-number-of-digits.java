class Solution {
    public static int numOfDigits(int n){
        int cnt = 0;
        while(n > 0){
            cnt++;
            n = n / 10; 
        
        }
    return cnt;
    }

    public static  int findNumbers(int[] nums) {
        int even = 0;
        for(int i = 0; i < nums.length; i++){
            if(numOfDigits(nums[i]) % 2 == 0){
                even++;
            }
        }
        return even;
    }
}
