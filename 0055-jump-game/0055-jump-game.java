class Solution {
    public boolean canJump(int[] nums) {
        int reach=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]+i>=reach){
                reach=i;
            }
        }
        if(reach==0){
            return true;
        }
        return false;
    }
}