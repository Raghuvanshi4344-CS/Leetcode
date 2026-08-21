class Solution {
    public int[] findErrorNums(int[] nums) {
        int s=0,ss=0;
        for(int i=1;i<=nums.length;i++){
            s+=i;
            ss+=nums[i-1];
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        System.out.println(ss);
        System.out.println(s);
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                arr[0]=nums[i];
                ss-=nums[i];
                arr[1]=s-ss;
                return arr;
            }
            hm.put(nums[i],i);
        }
        return arr;
    }
}