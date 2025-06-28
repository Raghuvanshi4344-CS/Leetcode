class Solution {
    public int pivotIndex(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++){
            s=s+nums[i];
        }
        int rs=0;
        for(int i=0;i<nums.length;i++){
            rs=rs+nums[i];
            if(rs==s){
                return i;
            }
            
            s=s-nums[i];
        }
        return -1;
    }
}