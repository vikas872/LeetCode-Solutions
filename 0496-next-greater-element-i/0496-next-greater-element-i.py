class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        st = []
        mp = {}

        for i in nums2:
            while st and st[-1]<i:
                mp[st.pop()] = i
            st.append(i)
        ans = []
        ind = 0
        for i in nums1:
            if i in mp:
                ans.append(mp.get(i))
            else:
                ans.append(-1)
            ind+=1
        return ans