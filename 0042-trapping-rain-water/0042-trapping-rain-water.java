class Solution {
    public int trap(int[] height) {
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int bottom = stack.pop();
                if (stack.isEmpty()) break;
                int left = stack.peek();
                int distance = i - left - 1;
                int boundedHeight = Math.min(height[i], height[left]) - height[bottom];
                max += distance * boundedHeight;
            }
            stack.push(i);
        }

        return max;
    }
}