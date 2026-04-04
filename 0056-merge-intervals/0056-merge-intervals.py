class Solution:
    def merge(self, arr: List[List[int]]) -> List[List[int]]:
        arr.sort()
        ans = [arr[0]]
        for i in arr:
            if ans[-1][1]<i[0]:
                # val = [min(arr[i-1][0],arr[i][0]),max(arr[i-1][1],arr[i][1])]
                ans.append(i)
            else:
                ans[-1][1] = max(i[1],ans[-1][1])
        return ans
        