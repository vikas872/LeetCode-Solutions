class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        minLen = len(strs[0])
        for s in strs:
            minLen = min(minLen,len(s))
        curr = strs[0]
        ans = ""
        for i in range(0,minLen):
            for st in strs:
                if st[i]!=curr[i]:
                    return ans
            ans+=curr[i]
        return ans