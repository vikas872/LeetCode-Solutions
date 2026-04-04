class Solution:
    def minSubArrayLen(self, target: int, arr: List[int]) -> int:
        l=0
        curr=0
        ans = float('inf')
        for r in range(len(arr)):
            curr+=arr[r]

            while curr>=target:
            
                ans = min(ans,r-l+1)
                curr-=arr[l]
                l+=1

        return 0 if ans==float('inf') else ans
        