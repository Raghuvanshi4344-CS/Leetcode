class Solution {
    public int removeDuplicates(int[] nums) {
        int arr[]=new int[nums.length];
        arr[0]=nums[0];
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(arr[k-1]!=nums[i]){
                arr[k]=nums[i];
                k++;
            }
        }
        for(int i=0;i<k;i++){
            nums[i]=arr[i];
        }
        // System.out.println(k);
        return k;
    }
}