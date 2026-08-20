class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=0;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) temp++;
            else {
                temp=0;
            }
            n=Math.max(n,temp);
        }
        return n;
    }
}