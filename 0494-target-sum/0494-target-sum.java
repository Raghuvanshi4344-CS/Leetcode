class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int s=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            s+=nums[i];
        }
        if ((target + s) % 2 != 0 || Math.abs(target) > s) {
            return 0;
        }
        s=(target+s)/2;
        // System.out.println(s);
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
        return arr[n][s];
    }
}