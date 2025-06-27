class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
            for(int i=1;i<nums.length;i++){
                if(nums[i]==nums[i-1]){
                    return true;
                }
            }
        // }
        return false;
    }
}



// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         HashSet<Integer> seen = new HashSet<>();
//         for (int num : nums) {
//             if (!seen.add(num)) {  
//                 return true;
//             }
//         }
//         return false;  
//     }
// }

