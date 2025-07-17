class Solution {
    public int uniquePaths(int n, int m) {
        int arr[][]=new int[n][m];
        Arrays.fill(arr[0],1);
        for(int i=0;i<n;i++) arr[i][0]=1; 
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                arr[i][j]=arr[i-1][j]+arr[i][j-1];
            }
        }
        return arr[n-1][m-1];
    }
}