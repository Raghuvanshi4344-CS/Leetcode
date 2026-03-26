// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         // if(nums1.length<2 || nums2.length<2) return nums1;
//         Map<Integer,Integer> map=new HashMap<>();

//         for(int i=0;i<nums1.length;i++){
//             for(int j=0;j<nums2.length;j++){
//                 if(nums1[i]==nums2[j]){
//                     if(!map.containsKey(nums1[i])){
//                         map.put(nums1[i],1);
//                     }
//                 }
//             }
//         }
//         int[] result = new int[map.size()];
//         int index = 0;
//         for (int key : map.keySet()) {
//             result[index++] = key;
//         }
//         return result;
//     }
// }



class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        // Store nums1 elements
        for (int num : nums1) {
            set1.add(num);
        }

        // Check nums2 against set1
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        // Convert set to array
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }
}