class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int low=0,high=nums.length-1;
        while(low<=high){
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            low++;high--;
        }
        low=0;high=k-1;
        while(low<=high){
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            low++;high--;
        }
        low=k;high=nums.length-1;
        while(low<=high){
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            low++;high--;
        }
    }
}