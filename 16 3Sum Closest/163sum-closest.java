class Solution {
    public int threeSumClosest(int[] arr, int target) {
        int cSum = Integer.MAX_VALUE;
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
                            int l = i + 1;
                int r = n - 1;
            while (r > l) {

                int sum = arr[i] + arr[l] + arr[r];
                if (Math.abs(sum - target) < Math.abs(cSum - target)) {
                    cSum = sum;
                } else if (sum > target) {
                    r--;
                } else if (sum < target) {
                    l++;
                } else {
                    return sum;
                }
            }
        }
        return cSum;
    }
}