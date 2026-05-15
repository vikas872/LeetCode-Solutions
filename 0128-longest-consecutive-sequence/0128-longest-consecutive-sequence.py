class Solution:
    def longestConsecutive(self, arr: List[int]) -> int:
        st = set(arr)
        ans = 0

        for x in st:
            if x-1 not in st:
                cnt = 1

                curr = x

                while curr+1 in st:
                    cnt+=1
                    curr+=1

                ans = max(ans,cnt)
        return ans
                