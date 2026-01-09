class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]!=val){
                        nums[k++]=nums[j];
                        nums[j]=val;
                        break;
                    }
                }
            }
            else{
                k++;
            }
        }
        return k;
    }
}