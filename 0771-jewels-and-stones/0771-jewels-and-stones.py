# class Solution:
#     def numJewelsInStones(self, jewels: str, stones: str) -> int:
#         ans = 0
#         map = {}
#         for ch in jewels:
#             if ch in map:
#                 map[ch]+=1
#             else:
#                 map[ch] = 1
        
#         for ch in stones:
#             ans+=map.get(ch,0)
#         return ans
class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        jewel_set = set(jewels)
        count = 0

        for ch in stones:
            if ch in jewel_set:
                count += 1

        return count