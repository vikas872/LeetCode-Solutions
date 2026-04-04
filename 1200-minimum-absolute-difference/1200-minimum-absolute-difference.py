class Solution:
    def minimumAbsDifference(self, arr: List[int]) -> List[List[int]]:
        ans = []
        arr.sort()
        min_diff = sys.maxsize
        for i in range(1,len(arr)):
            diff = arr[i]-arr[i-1]
            if diff<min_diff:
                min_diff = diff
        for i in range(1,len(arr)):
            if arr[i]-arr[i-1]==min_diff:
                val = [arr[i-1],arr[i]]
                ans.append(val)

        return ans
        
        