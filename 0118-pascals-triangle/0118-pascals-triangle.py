class Solution:
    def build(self,k):
        if k==1:
            arr = [[1]]
            return arr
        
        arr = self.build(k-1)
        prv = arr[-1]
        curr = [1]*k
        for i in range(1,k-1):
            curr[i] = prv[i-1]+prv[i]
        
        arr.append(curr)
        return arr

    def generate(self, k: int) -> List[List[int]]:
        return self.build(k)