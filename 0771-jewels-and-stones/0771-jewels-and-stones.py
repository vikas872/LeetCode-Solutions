class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        ans = 0
        map = {}
        for ch in jewels:
            if ch in map:
                map[ch]+=1
            else:
                map[ch] = 1
        
        for ch in stones:
            ans+=map.get(ch,0)
        return ans