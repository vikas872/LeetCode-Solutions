class Solution:
    def reverseWords(self, s: str) -> str:
        s = s.strip()
        sen = ""
        word = ""
        for i in range(len(s)-1,-1,-1):
            if not s[i].isspace():
                word +=s[i]
            else:
                if word:
                    sen+=word[::-1]+" "
                    word = ""
        sen+=word[::-1]
        return sen