class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        for(;i<nums.length;){
            if(nums[i]!=nums[nums[i]-1]){
                int temp=nums[i];
                nums[i]=nums[temp-1];
                nums[temp-1]=temp;
            }
            else i++;
        }
        for(int k=0;k<nums.length;k++){
            if(nums[k]-1!=k) return nums[k];
        }
        return nums.length;
    }
}