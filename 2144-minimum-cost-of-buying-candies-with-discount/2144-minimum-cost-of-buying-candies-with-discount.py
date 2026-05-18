class Solution:
    def minimumCost(self, arr: List[int]) -> int:
        arr.sort(reverse = True)
        cost = 0
        for i in range(len(arr)):
            if (i+1)%3!=0:
                cost+=arr[i]
            else:
                continue
        return cost