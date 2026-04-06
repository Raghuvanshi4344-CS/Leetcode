class Solution {
    public int largestRectangleArea(int[] arr) {
        if(arr.length==0) return 0;
        int max=0;
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<=arr.length;i++){
            int h=(i==arr.length)?0:arr[i];

            while(!s.isEmpty() && h<arr[s.peek()]){
                int height=arr[s.pop()];
                int width;
                if(s.isEmpty()) width=i;
                else width=i-s.peek()-1;
                max=Math.max(max,width*height);
            }
            s.push(i);
        }
        return max;
    }
}