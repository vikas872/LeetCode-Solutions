class Solution:
    def moveZeroes(self, arr: List[int]) -> None:
        n = len(arr)
        ip = 0
        for i in range(n):
            if arr[i]!=0:
                arr[ip] = arr[i]
                ip+=1
        while ip<n:
            arr[ip]  =  0
            ip+=1
        return arr 