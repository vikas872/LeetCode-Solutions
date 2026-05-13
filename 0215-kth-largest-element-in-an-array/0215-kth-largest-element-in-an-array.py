class Solution:
    def findKthLargest(self, arr: List[int], k: int) -> int:
        arr = sorted(arr)
        return arr[len(arr)-k]