class Solution:
    def isPalindrome(self, s: str) -> bool:
        l=0
        r=len(s)-1
        s=s.lower()

        while(l<r):
            while l<r and s[l].isalnum()==False:
                l+=1
            while l<r and s[r].isalnum()==False:
                r-=1
            if s[l]!=s[r]:
                return False
            l+=1
            r-=1
        return True
        