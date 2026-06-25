class Solution {
    public int jump(int[] nums) {
        int st=0,stop=0,max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]+i);
            if(i==stop){
                st++;
                stop=max;
            }
        }
        return st-1;
    }
}