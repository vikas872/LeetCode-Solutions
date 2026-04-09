def f(n,dp):
    if n<=1:
        return n
    if dp[n]!=-1:
        return dp[n]
    dp[n] = f(n-1,dp)+f(n-2,dp)
    return dp[n]
class Solution:
    def fib(self, n: int) -> int:
        dp = [-1]*(n+1)
        return f(n,dp)
        