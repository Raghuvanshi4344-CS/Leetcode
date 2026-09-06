class Solution {
    public void helper(int nums[],int low,int high){
        while(low<=high){
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            low++;high--;
        }
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        helper(nums,0,nums.length-1);
        helper(nums,0,k-1);
        helper(nums,k,nums.length-1);
    }
}