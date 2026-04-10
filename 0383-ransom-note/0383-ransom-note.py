class Solution:
    def canConstruct(self, tar: str, src: str) -> bool:
        mapt = {}
        maps = {}
        for ch in tar:
            if ch in mapt:
                mapt[ch]+=1
            else:
                mapt[ch]  = 1
        for ch in src:
            if ch in maps:
                maps[ch]+=1
            else:
                maps[ch]  = 1
        
        for c in mapt.keys():
            if maps.get(c,0)<mapt[c]:
                return False
        return True