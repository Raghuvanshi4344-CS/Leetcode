class Solution {
    public int first(int arr[],int n){
        int low=0,high=arr.length-1;
        int f=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==n){
                f=mid;
                high=mid-1;
            }
            else if(arr[mid]>n) high=mid-1;
            else low=mid+1;
        }
        return f;
    }
    public int last(int arr[],int n){
        int low=0,high=arr.length-1;
        int f=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==n){
                f=mid;
                low=mid+1;
            }
            else if(arr[mid]>n) high=mid-1;
            else low=mid+1;
        }
        return f;
    }
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        arr[0]=first(nums,target);
        arr[1]=last(nums,target);
        return arr;
    }
}