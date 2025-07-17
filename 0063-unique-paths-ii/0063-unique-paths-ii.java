class Solution {
    public int uniquePathsWithObstacles(int[][] Grid) {
        int n=Grid.length;
        int m=Grid[0].length;
        int arr[][]=new int[n][m];
        for(int i=0;i<m;i++){
            if(Grid[0][i]==1){
                arr[0][i]=0;
                break;
            }
            else{
                arr[0][i]=1;
            }
        }
        for(int i=0;i<n;i++){
            if(Grid[i][0]==1){
                arr[i][0]=0;
                break;
            }
            else{arr[i][0]=1;}
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(Grid[i][j]==1){
                    arr[i][j]=0;
                }
                else{
                    arr[i][j]=arr[i-1][j]+arr[i][j-1];
                }
            }
        }
        return arr[n-1][m-1];
    }
}