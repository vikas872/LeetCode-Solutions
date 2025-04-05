class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] index = new int[128];
        int left = 0, right = 0, maxLen = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            left = Math.max(index[r], left);
            maxLen = Math.max(maxLen, right - left + 1);
            index[r] = right + 1;
            right++;
        }
        return maxLen;
    }
}
