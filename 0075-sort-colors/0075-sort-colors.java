class Solution {
    public void sortColors(int[] nums) {
        int z=0,o=0,t=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) z++;
            else if(nums[i]==1) o++;
            else t++;
        }
        int k=0;
        while(z>0) {z--;nums[k++]=0;}
        while(o>0) {o--;nums[k++]=1;}
        while(t>0) {t--;nums[k++]=2;}
    }
}