class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int in1=0,in2=0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target && j!=i){
        //             in1=i;
        //             in2=j;
        //             break;
        //         }
        //     }
        // }
        // int arr[]=new int[2];
        // arr[0]=in1;
        // arr[1]=in2;
        // return arr;
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hash.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int tg=target-nums[i];
            if(hash.containsKey(tg)){
                if (hash.get(tg) != i) {
                    return new int[] { i, hash.get(tg) };
                }
            }
        }
        return new int[0];
    }
}