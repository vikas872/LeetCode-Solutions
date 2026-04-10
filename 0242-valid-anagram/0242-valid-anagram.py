class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        map = {}
        mapt = {}
        for ch in s:
            if ch in map:
                map[ch] +=1
            else:
                map[ch] = 1
        for ch in t:
            if ch in mapt:
                mapt[ch] +=1
            else:
                mapt[ch] = 1
        
        ls = map.items()
        lt = mapt.items()
        return ls==lt
    
