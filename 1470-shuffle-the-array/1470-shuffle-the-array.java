class Solution {
    public int[] shuffle(int[] nums, int n) {
        // int k=n;
        // for(int i=0;i<k;i++){
        //     int temp=nums[i+1];
        //     nums[i+1]=nums[i+k];
        //     nums[i+k]=temp;
        // }
        // return nums;
        int arr[]=new int[n*2];
        int j=0;
        for(int i=0;i<n;i++){
            arr[j]=nums[i];
            arr[j+1]=nums[i+n];
            j+=2;
        }
        return arr;
    }
}