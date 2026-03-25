class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[]=new int[nums.length];
        int m=1;
        int y=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) y++;
            else m=m*nums[i];
        }
        for(int i=0;i<arr.length;i++){
            if(y>1) arr[i]=0;
            else if(y==1){
                if(nums[i]==0){
                    arr[i]=m;
                }
                else{
                    arr[i]=0;
                }
            }
            else arr[i]=m/nums[i];
        }
        return arr;
    }
}