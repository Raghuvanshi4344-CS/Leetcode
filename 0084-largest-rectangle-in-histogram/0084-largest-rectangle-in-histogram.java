class Solution {
    public int largestRectangleArea(int[] height) {
        if(height.length<2) return height[0];
        int max=0;
        int n=height.length;
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<=height.length;i++){
            int h = (i == n) ? 0 : height[i]; 
            while (!s.isEmpty() && h < height[s.peek()]) { 
                int hh = height[s.pop()]; 
                int width; 
                if (s.isEmpty()){ 
                    width = i; 
                }
                else {
                    width =i-s.peek()-1; 
                }
                max = Math.max(max, hh * width);
            } 
            s.push(i);
        }
        return max;
    }
}