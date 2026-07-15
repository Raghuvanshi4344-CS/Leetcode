class Solution {
    public int trap(int[] height) {
        int max=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<height.length;i++){
            while(!st.isEmpty() && height[st.peek()]<height[i]){
                int temp=st.pop();
                if(st.isEmpty()) break;
                int diff=i-st.peek()-1;
                int dep=Math.min(height[i],height[st.peek()])-height[temp];
                max+=dep*diff;
            }
            st.push(i);
        }
        return max;
    }
}