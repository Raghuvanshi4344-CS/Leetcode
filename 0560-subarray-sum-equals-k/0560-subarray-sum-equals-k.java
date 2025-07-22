// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         HashMap<Integer,Integer> hash=new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             hash.put(nums[i],i);
//         }
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             int tg=k-nums[i];
//             if(hash.containsKey(tg) && hash.get(tg)!=i){
//                 count++;
//             }
//         }
//         return count;
//     }
// }
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int sum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k) {
                count++;
            }

            if (hash.containsKey(sum - k)) {
                count += hash.get(sum - k);
            }

            hash.put(sum, hash.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
