class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map = {}
        for ch in strs:
            val = "".join(sorted(ch))
            if val in map:
                map[val].append(ch)
            else:
                map[val] = [ch]
        return list(map.values()) 