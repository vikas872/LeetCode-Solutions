class Solution {
       public boolean check(int[] nums) {
        int error = 0;
        if(nums.length<2){
            return true;
        }
       for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[(i+1)%(nums.length)]){
                error=error+1;
            }
            if((error>0)&&(nums[nums.length-1]>nums[0])){
                return false;
            }
            if(error>1){
                return false;
            }
        }
        return true;
        
       }
    }

