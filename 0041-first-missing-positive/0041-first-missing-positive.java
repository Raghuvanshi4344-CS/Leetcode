class Solution {
    public int firstMissingPositive(int[] nums) {
        int sm=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if (nums[i] < sm) {
                continue;
            }
            if (nums[i] == sm) {
                sm++;
            } else {
                return sm;
            }
        }
        return sm;
    }
}