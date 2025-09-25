class Solution {
    public static int mul(int n){
        int temp = n;
        int sum = 0;
        while(temp>0){
            int dig = temp%10;
            temp = temp/10;
            sum += dig;
        }
        return sum;
        
    }
    public int differenceOfSum(int[] nums) {
        int esum = 0;
        for(int i:nums){
            esum+=i;
        }
        int dsum = 0;
        for(int i:nums){
            if (i<10){
               dsum+=i; 
            }
            else{
                dsum+= mul(i);
            }
        }
        int ans = Math.abs(esum - dsum);
        return ans;
    }
}