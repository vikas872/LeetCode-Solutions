class Solution {
    public int maxProduct(int[] arr) {
        int pre = 1;
        int maxi = Integer.MIN_VALUE;
        int suff = 1;
        for(int i=0;i<arr.length;i++){
            if(pre==0){
                pre = 1;
            }
            if(suff==0){
                suff=1;
            }
            pre = pre*arr[i];
            suff = suff*arr[arr.length-i-1];
            maxi = Math.max(maxi,Math.max(pre,suff));
        }
        return maxi;
    }
}