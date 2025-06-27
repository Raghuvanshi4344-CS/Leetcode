class Solution {
    public int search(int[] arr, int x) {
        int low=0;
        int high=arr.length-1;
        int mid=-1;
        while(low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<=x && arr[mid]>x){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(arr[mid]<x && arr[high]>=x){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}