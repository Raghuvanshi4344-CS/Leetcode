class Solution {
    public int trap(int[] height) {
        int max=0;
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<height.length){
            while(!s.isEmpty() && height[i]>height[s.peek()]){
                int x=s.pop();
                if(s.isEmpty()) break;
                int y=i-s.peek()-1;
                int high=Math.min(height[i],height[s.peek()])-height[x];
                max+=y*high;
            }
        }
        return max;
    }
}