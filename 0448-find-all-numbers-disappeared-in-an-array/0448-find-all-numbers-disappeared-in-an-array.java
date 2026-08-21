class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ls=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            if(nums[i]!=nums[nums[i]-1]){
                int temp=nums[i];
                nums[i]=nums[temp-1];
                nums[temp-1]=temp;
            }
            else i++;
        }
        // for(int k:nums){
        //     System.out.println(k);
        // }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1) ls.add(i+1);
        }
        return ls;
    }
}