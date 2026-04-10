class Solution:
    def reverseWords(self, s: str) -> str:
        s = s.strip()
        word = ""
        ans = ""
        for i in range(len(s)-1,-1,-1):
            if not s[i].isspace():
                word+=s[i]
                
            else:
                if word:
                    ans+=word[::-1]+" "
                    word = ""
            
        ans+=word[::-1]
        return ans