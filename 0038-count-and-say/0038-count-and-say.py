class Solution:
    def countAndSay(self, n: int) -> str:
        if n==1:
            return "1"
        prv = self.countAndSay(n-1)
        ans = ""
        i = 0
        n = len(prv)
        
        while i<n:
            cnt = 1
            while i<n-1 and prv[i]==prv[i+1]:
                i+=1
                cnt+=1
            ans += str(cnt) + prv[i]
            i+=1
        return ans