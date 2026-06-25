class Solution {
    public int removeDuplicates(int[] nums) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // int uq=0;
        // for(int i=0;i<nums.length;i++){
        //     if(map.containsKey(nums[i])){
        //         if (map.get(nums[i]) < 2) {
        //             map.put(nums[i], map.get(nums[i]) + 1);
        //             nums[uq] = nums[i];
        //             uq++;
        //         }
        //     }
        //     else{ 
        //         map.put(nums[i],1);
        //         nums[uq] = nums[i];
        //         uq++;
        //     }
        // }
        // return uq;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(k<2 || nums[i]!=nums[k-2]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}