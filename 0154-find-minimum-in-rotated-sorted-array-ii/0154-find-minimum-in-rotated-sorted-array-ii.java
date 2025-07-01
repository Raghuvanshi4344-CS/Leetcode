class Solution {
    public int findMin(int[] arr) {
        int low=0;
        int high =arr.length-1;
        int mid=-1;
        while(low<high){
            mid=low+(high-low)/2;
            if(arr[mid]==arr[low] &&arr [mid]==arr[high]){
                low++;
                high--;
            }
            else if(arr[mid]>arr[high]){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return arr[low];
    }
}