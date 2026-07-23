class Solution:
    def maxArea(self, arr):
        max_area = 0
        left = 0
        right = len(arr) - 1

        while left <= right:
            temp = 0

            if arr[left] < arr[right]:
                temp = arr[left] * (right - left)
                left += 1
            else:
                temp = arr[right] * (right - left)
                right -= 1

            max_area = max(max_area, temp)

        return max_area