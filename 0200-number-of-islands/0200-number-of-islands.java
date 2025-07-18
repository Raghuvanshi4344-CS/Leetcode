class Solution {
    void dfs(char arr[][],int i,int j,int r,int c){
        if(i>=r|| j>=c || i<0 || j<0 || arr[i][j]=='0') return;
        arr[i][j]='0'; //Mark as visited
        dfs(arr,i,j+1,r,c);
        dfs(arr,i-1,j,r,c);
        dfs(arr,i,j-1,r,c);
        dfs(arr,i+1,j,r,c);
    }
    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j,r,c);
                    count++;
                }
            }
        }
        return count;
    }
}