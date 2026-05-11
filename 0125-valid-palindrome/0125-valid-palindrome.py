class Solution:
    def isPalindrome(self, s: str) -> bool:
        val = []
        s = s.lower()
        for ch in s:
            if ch.isalnum():
                val.append(ch)
        l = 0
        r = len(val)-1
        while l<r:
            if val[l]!=val[r]:
                return False
            l+=1
            r-=1
        return True