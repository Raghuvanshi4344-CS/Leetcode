class Solution {
    public int rob(int[] nums) {
        int arr[]=new int [nums.length];
        if(nums.length==1) return nums[0];
        arr[0]=nums[0];
        arr[1]=Math.max(arr[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            arr[i]=Math.max(arr[i-1],nums[i]+arr[i-2]);
        }
        return arr[nums.length-1];
    }
}