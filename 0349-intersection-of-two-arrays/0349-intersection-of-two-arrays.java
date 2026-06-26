class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<>();
        Set<Integer> res=new HashSet<>();
        for(int i:nums1){
            s1.add(i);
        }

        for(int i:nums2){
            if(s1.contains(i)) res.add(i);
        }

        int []r=new int[res.size()];
        int i=0;
        for(int j:res){
            r[i++]=j;
        }
        return r;
    }
}