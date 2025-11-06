class Solution {

    public void wiggleSort(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.sort(nums);
        int i = 1;
        int j = arr.length - 1;
        while (i < arr.length) {
            arr[i] = nums[j];
            i += 2;
            j--;
        }
        i = 0;
        while (i < arr.length) {
            arr[i] = nums[j];
            i += 2;
            j--;
        }
        for(int k=0;k<arr.length;k++){
            nums[k] = arr[k];
        }
    }
}