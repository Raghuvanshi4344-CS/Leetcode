class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n=nums1.length+1;
        int m=nums2.length+1;
        int arr[][]=new int [n][m];
        int ans=0;
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(nums1[i-1]==nums2[j-1]){
                    arr[i][j]=arr[i-1][j-1]+1;
                    ans=Math.max(arr[i][j],ans);
                }
                else{
                    arr[i][j]=0;
                }
            }
        }
        return ans;
    }
}