class Solution {
    public int first(int []nums,int target){
        int low=0,high=nums.length-1;
        int temp=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                temp=mid;
                high=mid-1;
            }
            else if(nums[mid]>target) high=mid-1;
            else low=mid+1;
        }
        return temp;
    }
    public int last(int []nums,int target){
        int low=0,high=nums.length-1;
        int temp=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target) {
                temp=mid;
                low=mid+1;
            }
            else if(nums[mid]>target) high=mid-1;
            else low=mid+1;
        }
        return temp;
    }
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        arr[0]=first(nums,target);
        arr[1]=last(nums,target);
        return arr;
    }
}