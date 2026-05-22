class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int t=target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(t==nums[j]){
                    arr[1]=j;
                    arr[0]=i;
                    return arr;
                }
            }
        }
        return arr;
    }
}