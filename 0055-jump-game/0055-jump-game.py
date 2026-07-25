class Solution(object):
    def canJump(self, nums):
        reach = len(nums) - 1

        for i in range(len(nums) - 1, -1, -1):
            if nums[i] + i >= reach:
                reach = i

        return reach == 0