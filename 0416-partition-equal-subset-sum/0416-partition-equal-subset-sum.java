class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int s=0;
        for(int i=0;i<n;i++){
            s+=nums[i];
        }
        if(s%2!=0) return false;
        s=s/2;
        int arr[][]=new int[n+1][s+1];
        arr[0][0]=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=s;j++){
                if(nums[i-1]>j){
                    arr[i][j]=arr[i-1][j];
                }
                else{
                    arr[i][j]=arr[i-1][j]+arr[i-1][j-nums[i-1]];
                }
            }
        }
        if(arr[n][s]!=0) return true;
        return false;

    }
}