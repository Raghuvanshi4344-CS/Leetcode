class Solution:
    def removeDuplicates(self, nums):
        u = 0

        for j in range(len(nums)):
            if nums[u] != nums[j]:
                u += 1
                nums[u] = nums[j]

        return u + 1