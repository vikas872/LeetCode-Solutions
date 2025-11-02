class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        if (arr.length < 3 || arr[0] > 0) {
            return ans;
        }
        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int r = n - 1;
            int l = i + 1;

            while (r > l) {
                int currSum = arr[i] + arr[l] + arr[r];
                if (arr[i] + arr[r] + arr[l] == 0) {
                    ans.add(Arrays.asList(arr[i], arr[l], arr[r]));
                    while (r > l && arr[l] == arr[l + 1]) {
                        l++;
                    }
                    while (r > l && arr[r] == arr[r - 1]) {
                        r--;
                    }

                    l++;
                    r--;
                }

                else if (currSum > 0) {
                    r--;
                } else {
                    l++;
                }

            }
        }
        return ans;
    }
}