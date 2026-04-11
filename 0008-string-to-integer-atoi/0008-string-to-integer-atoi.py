class Solution:
    def myAtoi(self, s: str) -> int:
        i = 0
        n = len(s)
        sign  = 1

        while i<n and s[i]==' ':
            i+=1
        
        if i==n:
            return 0
        if s[i]=='-':
            sign = -1
            i+=1
        elif s[i]=='+':
            sign = 1
            i+=1
        ans = 0
        while i<n and s[i].isnumeric():
            ans = ans*10+int(s[i])
            i+=1
        
        ans = ans*sign

        INT_MIN = -2**(31)
        INT_MAX = (2**31)-1
        if ans<INT_MIN:
            return INT_MIN
        elif ans>INT_MAX:
            return INT_MAX
        return ans

