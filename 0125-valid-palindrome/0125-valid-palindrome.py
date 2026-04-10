class Solution:
    def isPalindrome(self, s: str) -> bool:
        s= s.lower()
        arr = []
        for ch in s:
            if ch.isalnum():
                arr.append(ch)
        l=0
        n=len(arr)
        r=n-1
        while l<r:
            if arr[l]!=arr[r]:
                return False
            r-=1
            l+=1
        return True