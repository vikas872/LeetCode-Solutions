class Solution:
    def freqAlphabets(self, s: str) -> str:
        n = len(s)
        ans = ""
        i=0
        while i<n:
            if i+2<n and s[i+2]=='#':
                curr = int(s[i:i+2])
                ans+=chr(ord('a')+curr-1)
                i+=3
            else:
                curr = int(s[i])
                ans+=chr(ord('a')+curr-1)
                i+=1
        return ans