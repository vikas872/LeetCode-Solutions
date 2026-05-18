class Solution:
    def maxFrequencyElements(self, arr: List[int]) -> int:
        mp = {}
        for i in arr:
            if i in mp:
                mp[i] += 1
            else:
                mp[i] = 1
        val = list(mp.values())
        maxFrq = max(val)
        cnt = 0
        for i in mp:
            if mp[i] == maxFrq:
                cnt+=1
        return maxFrq*cnt

