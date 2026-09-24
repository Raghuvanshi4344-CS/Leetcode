class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int temp=0;
        for(int i:nums){
            if(i==1) temp++;
            else if(i==0){
                c=Math.max(temp,c);
                temp=0;
            }
        }
        c=Math.max(c,temp);
        return c;
    }
}