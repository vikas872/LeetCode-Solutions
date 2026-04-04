class Solution:
    def twoSum(self, arr: List[int], target: int) -> List[int]:
        l = 0
        n = len(arr)
        r = n-1
        while(l<r):
            curr = arr[l]+arr[r]
            if curr == target:
                return [l+1, r+1]
            elif curr<target:
                l+=1
            else:
                r-=1
        return [0,0] 