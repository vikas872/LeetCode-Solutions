class Solution {
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int ls = arr[l] * arr[l];
            int rs = arr[r] * arr[r];
            if (ls > rs) {
                result[i] = ls;
                l++;
            }
            else{
                result[i] = rs;
                r--;
            }
        }
        return result;
    }
}