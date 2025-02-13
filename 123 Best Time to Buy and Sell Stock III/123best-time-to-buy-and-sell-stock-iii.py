class Solution(object):
    def maxProfit(self, prices):
        if not prices:
            return 0
        first_buy = second_buy = float('inf')
        first_profit = second_profit = 0
        for price in prices:
            first_buy = min(first_buy, price)
            first_profit = max(first_profit, price - first_buy)
            second_buy = min(second_buy, price - first_profit)
            second_profit = max(second_profit, price - second_buy)
        return second_profit
