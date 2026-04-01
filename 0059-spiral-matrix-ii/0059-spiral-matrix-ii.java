class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][]=new int[n][n];
        int top=0,bottom=n-1;
        int left=0, right=n-1;
        int x=1;
        while(left<=right && bottom>=top ){
            for(int j=left;j<=right;j++) {
                arr[top][j]=x;
                x++;
            }
            top++;

            for(int j=top;j<=bottom;j++){
                arr[j][right]=x;
                x++;
            }
            right--;

            for(int j=right;j>=left;j--){
                arr[bottom][j]=x;
                x++;    
            }
            bottom--;

            for(int i=bottom;i>=top;i--) {
                arr[i][left]=x;
                x++;
            }
            left++;
        }
        return arr;
    }
}