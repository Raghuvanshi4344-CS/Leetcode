class Solution {
    void dfs(int [][]arr,int i,int j,int r,int c,int temp[]){
        if(i>=r || j>=c || i<0 || j<0 || arr[i][j]==0) return;
        arr[i][j]=0;
        temp[0]++;
        dfs(arr,i,j+1,r,c,temp);
        dfs(arr,i-1,j,r,c,temp);
        dfs(arr,i,j-1,r,c,temp);
        dfs(arr,i+1,j,r,c,temp);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int temp[]={0};
                if(grid[i][j]==1){
                    dfs(grid,i,j,r,c,temp);
                    sum=Math.max(sum,temp[0]);
                }
            }
        }
        return sum;
    }
}