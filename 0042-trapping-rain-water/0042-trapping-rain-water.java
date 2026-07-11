class Solution {
    public int trap(int[] height) {
        int max=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<height.length;i++){
            while(!st.isEmpty() && height[i]>height[st.peek()]){
                int temp=st.pop();
                if(st.isEmpty())break;
                int diff=i-st.peek()-1;
                int depth=Math.min(height[i],height[st.peek()])-height[temp];
                max+=diff*depth;
            }
            st.push(i);
        }
        return max;
    }
}