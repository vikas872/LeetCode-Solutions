class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums)==0:
            return 0
        arr = sorted(nums)
        ans = 1
        cnt = 1
        for i in range(1,len(arr)):
            if arr[i]==arr[i-1]:
                continue
            if arr[i] == arr[i-1]+1:
                cnt+=1
            else:
                cnt = 1
            ans = max(ans,cnt)

        return ans
            