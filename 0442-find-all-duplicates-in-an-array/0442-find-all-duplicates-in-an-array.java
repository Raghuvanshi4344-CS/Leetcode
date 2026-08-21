class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        List<Integer> ls=new ArrayList<>();
        for(;i<nums.length;){
            if(nums[i]!=nums[nums[i]-1]){
                int temp=nums[i];
                nums[i]=nums[temp-1];
                nums[temp-1]=temp;
            }
            else{
                i++;
            }
        }
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=k+1) ls.add(nums[k]);
        }
        return ls;
    }
}