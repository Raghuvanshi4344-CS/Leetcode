class Solution {
    public int trap(int[] height) {
        Stack<Integer> st=new  Stack<>();
        int max=0;
        for(int i=0;i<height.length;i++){
            while(!st.isEmpty() && height[st.peek()]<height[i]){
                int temp=st.pop();
                if(st.isEmpty()) break;
                int diff=i-st.peek()-1;
                int heig=Math.min(height[i],height[st.peek()])-height[temp];
                max+=diff*heig;
            }
            st.push(i);
        }
        return max;
    }
}