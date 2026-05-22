class Solution {
    public int maxArea(int[] arr) {
        int max=0;
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=0;
            if(arr[left]<arr[right]){
                temp=arr[left]*(right-left);
                left++;
            }
            else {
                temp=arr[right]*(right-left);
                right--;
            }
            max=Math.max(max,temp);
        }
        return max;
    }
}