class Solution {
    public int majorityElement(int[] nums) {
        int c=1;
        int n=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==n)c++;
            else if(c==0){
                n=nums[i];
                c++;
            }
            else c--;
        }
        return n;
    }
}