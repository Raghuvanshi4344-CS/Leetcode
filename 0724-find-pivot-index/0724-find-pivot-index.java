class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int suml=0;
        int i=0;
        for(;i<nums.length;i++){
            if(suml==sum-nums[i]) return i;
            sum-=nums[i];
            suml+=nums[i];
        }
        return -1;
    }
}