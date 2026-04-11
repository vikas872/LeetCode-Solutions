class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        n = len(haystack)
        m = len(needle)

        # edge case
        if m == 0:
            return 0

        # try every starting position
        for start in range(n - m + 1):
            if needle in haystack[start:start + m] :
                return start

        return -1