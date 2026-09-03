class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int count=0;
        for(int num:set){
            int curr=num;
            int temp=1;
            if(!set.contains(curr-1)){
                while(set.contains(curr+1)){
                    curr++;
                    temp++;
                }
            }
            count=Math.max(count,temp);
        }
        return count;
    }
}