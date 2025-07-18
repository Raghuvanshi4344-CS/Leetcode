class Solution {
    public int islandPerimeter(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int ans=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    if(i==0 || grid[i-1][j]==0) ans++;
                    if(i==r-1 || grid[i+1][j]==0) ans++;
                    if(j==0 || grid[i][j-1]==0) ans++;
                    if(j==c-1 || grid[i][j+1]==0) ans++;
                }
            }
        }
        return ans;
        // int ans[]={0};
        // for(int i=0;i<r;i++){
        //     for(int i=0;i<c;i++){
        //         if(grid[i][j]==1){
        //             dfs(grid,i,j,r,c,ans);
        //         }
        //     }
        // }
        // return ans[0];
    }
}