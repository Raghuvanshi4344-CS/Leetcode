class Solution {
    public int trap(int[] arr) {
        int max=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                int temp=st.pop();
                if(st.isEmpty()) break;
                int diff=i-st.peek()-1;
                int height=Math.min(arr[i],arr[st.peek()])-arr[temp];
                max+=diff*height;
            }
            st.push(i);
        }
        return max;
    }
}