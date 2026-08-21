class Solution {
    public int missingNumber(int[] nums) {
        int s=0,ss=0;
        for(int i=0;i<=nums.length;i++) ss+=i;
        for(int i:nums){
            s+=i;
        }
        return ss-s;
    }
}