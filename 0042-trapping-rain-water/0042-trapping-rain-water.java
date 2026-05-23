class Solution {
    public int trap(int[] arr) {
        int area=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                int temp=st.pop();
                if(st.isEmpty()) break;
                int diff=i-st.peek()-1;
                int depth=Math.min(arr[i],arr[st.peek()])-arr[temp];
                area+=diff*depth;
            }
            st.push(i);
        }
        return area;
    }
}