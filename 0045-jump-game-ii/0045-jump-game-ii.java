class Solution {
    public int jump(int[] nums) {
        int start=0;
        int max=0;
        int stop=0;
        for(int i=0;i<nums.length-1;i++){
            max=Math.max(max,nums[i]+i);
            if(i==stop){
                start++;
                stop=max;
            }
        }
        return start;
    }
}