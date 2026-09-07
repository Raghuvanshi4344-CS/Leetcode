class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        int max=0;
        for(int i:hs){
            int curr=i;
            int temp=1;
            if(!hs.contains(curr-1)){
                while(hs.contains(curr+1)){
                    curr++;
                    temp++;
                }
            }
            max=Math.max(max,temp);
        }
        return max;
    }
}