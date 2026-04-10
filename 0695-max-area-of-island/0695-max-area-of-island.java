class Solution {

    void dfs(int grid[][],int i,int j,int r ,int c,int temp[]){
        if(i<0 || j<0 || i>=r || j>=c || grid[i][j]==0) return;
        temp[0]++;
        grid[i][j]=0;
        dfs(grid,i-1,j,r,c,temp);
        dfs(grid,i+1,j,r,c,temp);
        dfs(grid,i,j-1,r,c,temp);
        dfs(grid,i,j+1,r,c,temp);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int r=grid.length,c=grid[0].length;
        int max=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int temp[]=new int[1];
                dfs(grid,i,j,r,c,temp);
                max=Math.max(max,temp[0]);
            }
        }
        return max;
    }
}