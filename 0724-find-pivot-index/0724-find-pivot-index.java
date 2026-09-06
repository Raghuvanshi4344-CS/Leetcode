class Solution {
    public int pivotIndex(int[] nums) {
        int sb=0;
        for(int i:nums){
            sb+=i;
        }
        int sa=0;
        for(int i=0;i<nums.length;i++){
            if(sa+nums[i]==sb) return i;
            sa+=nums[i];
            sb-=nums[i];
        }
        return -1;
    }
}