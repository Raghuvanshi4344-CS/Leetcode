class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // if(nums1.length<2 || nums2.length<2) return nums1;
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    if(!map.containsKey(nums1[i])){
                        map.put(nums1[i],1);
                    }
                }
            }
        }
        int[] result = new int[map.size()];
        int index = 0;
        for (int key : map.keySet()) {
            result[index++] = key;
        }
        return result;
    }
}