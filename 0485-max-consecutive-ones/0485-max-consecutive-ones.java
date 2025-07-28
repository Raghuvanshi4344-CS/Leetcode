class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int temp=0;
        int low=0,high=nums.length-1;
        while(low<=high){
            if(nums[low]==1){
                temp++;
            }          
            else{
                max=Math.max(max,temp);
                temp=0;
            }
            low++;  
        }
        return Math.max(max,temp);
    }
}