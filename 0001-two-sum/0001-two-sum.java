class Solution {
    public int[] twoSum(int[] nums, int target) {
        int in1=0,in2=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]+nums[j]==target && j!=i){
                    in1=i;
                    in2=j;
                    break;
                }
            }
        }
        int arr[]=new int[2];
        arr[0]=in1;
        arr[1]=in2;
        return arr;
    }
}