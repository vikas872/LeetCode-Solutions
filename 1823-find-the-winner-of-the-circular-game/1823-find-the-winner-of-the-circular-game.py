class Solution:
    def findTheWinner(self, n: int, k: int) -> int:
        safe = 0
        for i in range(2,n+1):
            safe = (safe+k)%i

        return safe+1