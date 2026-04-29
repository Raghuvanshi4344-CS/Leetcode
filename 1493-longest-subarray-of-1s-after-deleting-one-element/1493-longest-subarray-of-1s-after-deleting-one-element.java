class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int temp=0;
            int count=0;
                for(int j=i;j<nums.length;j++){
                    if(nums[j]==1) count++;
                    else{ 
                        if(temp==1) break;
                        temp++;
                    }
                }
            max=Math.max(max,count);
        }
        if(max==nums.length) return nums.length-1;
        return max;
    }
}