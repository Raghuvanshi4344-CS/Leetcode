class Solution {
    public int majorityElement(int[] nums) {
        int ele=nums[0];
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele){
                c++;
            }
            else if(c==0){
                ele=nums[i];
                c++;
            }
            else{
                c--;
            }
        } 
        return ele;
    }
}