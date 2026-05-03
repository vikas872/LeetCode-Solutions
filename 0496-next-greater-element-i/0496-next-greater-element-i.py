class Solution:
    def nextGreaterElement(self, arr1: List[int], arr2: List[int]) -> List[int]:
        n1 = len(arr1)
        n2 = len(arr2)
        ans = []
        for i in range(0,n1):
            for j in range(0,n2):
                if arr1[i]==arr2[j]:
                    while j<n2-1:
                        if arr2[j+1]>arr1[i]:
                            ans.append(arr2[j+1])
                            break
                        j+=1
                        
                    if j==n2-1:
                        ans.append(-1)
        return ans
                    