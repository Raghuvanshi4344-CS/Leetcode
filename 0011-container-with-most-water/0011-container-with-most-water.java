class Solution {
    public int maxArea(int[] arr) {
        int max=0;
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=Math.min(arr[left],arr[right])*(right-left);
            max=Math.max(temp,max);
            if(arr[left]<arr[right]){
                // temp=arr[left]*(right-left);
                left++;
            }
            else{
                // temp=arr[right]*(right-left);
                right--;
            }
            // if(temp>max) max=temp;
        }
        return max;
    }
}
