class Solution:
    def reverseVowels(self, s: str) -> str:
        n=len(s)
        l=0
        r=n-1
        ans = list(s)
        def vow(ch):
            if ch in "aeiouAEIOU":
                return True
            return False
        while l<r:
            while(l<r and not vow(s[l])):
                l+=1
            while(l<r and not vow(s[r])):
                r-=1
            ans[l] = s[r]
            ans[r] = s[l]
            l+=1
            r-=1
        return "".join(ans)

