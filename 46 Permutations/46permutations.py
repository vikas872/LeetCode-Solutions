class Solution(object):
    def permute(self, nums):
        if len(nums) == 0:
            return []
        if len(nums) == 1:
            return [nums]
        
        permutations = []
        for i in range(len(nums)):
            rest = nums[:i] + nums[i+1:]
            for perm in self.permute(rest):
                permutations.append([nums[i]] + perm)
        
        return permutations
