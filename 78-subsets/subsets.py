class Solution(object):
    def dfs(self, nums, l, curr, res):
        if l == len(nums):
            res.append(curr[:])
            return
        curr.append(nums[l])
        self.dfs(nums, l + 1, curr, res)
        curr.pop()
        self.dfs(nums, l + 1, curr, res)
    def subsets(self, nums):
        res = []
        self.dfs(nums, 0, [], res)
        return res