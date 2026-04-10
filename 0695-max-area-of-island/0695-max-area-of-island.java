// class Solution {

//     void dfs(int grid[][],int i,int j,int r ,int c,int temp[]){
//         if(i<0 || j<0 || i>=r || j>=c || grid[i][j]==0) return;
//         temp[0]++;
//         grid[i][j]=0;
//         dfs(grid,i-1,j,r,c,temp);
//         dfs(grid,i+1,j,r,c,temp);
//         dfs(grid,i,j-1,r,c,temp);
//         dfs(grid,i,j+1,r,c,temp);
//     }
//     public int maxAreaOfIsland(int[][] grid) {
//         int r=grid.length,c=grid[0].length;
//         int max=0;
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 int temp[]=new int[1];
//                 dfs(grid,i,j,r,c,temp);
//                 max=Math.max(max,temp[0]);
//             }
//         }
//         return max;
//     }
// }


import java.util.*;

class Solution {

    public int maxAreaOfIsland(int[][] grid) {
        int r = grid.length, c = grid[0].length;
        int max = 0;

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){

                if(grid[i][j] == 1){
                    int area = bfs(grid, i, j, r, c);
                    max = Math.max(max, area);
                }
            }
        }
        return max;
    }

    int bfs(int[][] grid, int i, int j, int r, int c){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});
        grid[i][j] = 0; // mark visited

        int area = 0;

        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};

        while(!q.isEmpty()){
            int[] curr = q.poll();
            area++;

            for(int[] d : dir){
                int ni = curr[0] + d[0];
                int nj = curr[1] + d[1];

                if(ni >= 0 && nj >= 0 && ni < r && nj < c && grid[ni][nj] == 1){
                    q.add(new int[]{ni, nj});
                    grid[ni][nj] = 0; // mark visited
                }
            }
        }
        return area;
    }
}