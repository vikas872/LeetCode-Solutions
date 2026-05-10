class Solution:
    def setZeroes(self, arr: List[List[int]]) -> None:
        m = len(arr)
        n = len(arr[0])

        row = set()
        col = set()

        for i in range(m):
            for j in range(n):
                if arr[i][j]==0:
                    row.add(i)
                    col.add(j)

        for i in range(m):
            for j in range(n):
                if i in row or j in col:
                    arr[i][j] = 0
        