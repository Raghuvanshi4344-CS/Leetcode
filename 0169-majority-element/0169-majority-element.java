class Solution {
    public int majorityElement(int[] nums) {
        int c=1;
        int temp=nums[0];
        for(int i=1;i<nums.length;i++){
            if(c==0){
                temp=nums[i];
                c++;
            }
            else if(temp==nums[i]) c++;
            else c--;
        }
        return temp;
    }
}