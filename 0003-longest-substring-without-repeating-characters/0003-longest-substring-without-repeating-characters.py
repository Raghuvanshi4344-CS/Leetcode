class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        map = {}
        x = 0
        y = 0

        for i in range(len(s)):
            c = s[i]

            if c in map and map[c] >= x:
                x = map[c] + 1

            map[c] = i
            y = max(y, i - x + 1)

        return y