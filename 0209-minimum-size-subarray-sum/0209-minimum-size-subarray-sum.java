class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int min=Integer.MAX_VALUE;
        int sum=0;
        int left=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            while(sum>=target){
                min=Math.min(min,i-left+1);
                sum-=arr[left];
                left++;
            }
        }
        return min==Integer.MAX_VALUE ? 0 : min;
    }
}