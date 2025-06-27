class Solution {
    public int first(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        int temp=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                temp=mid;
                high=mid-1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return temp;
    }

    public int last(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        int temp=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                temp=mid;
                low=mid+1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return temp;
    }
    public int[] searchRange(int[] nums, int target) {
        int x=first(nums,target);
        int y=last(nums,target);
        int arr[]={x,y};
        return arr;
    }
}