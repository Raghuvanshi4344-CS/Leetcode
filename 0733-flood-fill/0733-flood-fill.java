class Solution {
    void dfs(int [][]arr,int i,int j,int r,int c,int oc,int nc){
        if(i>=r || j>=c || i<0|| j<0|| arr[i][j]!=oc ) return;
        arr[i][j]=nc;
        dfs(arr,i,j+1,r,c,oc,nc);
        dfs(arr,i-1,j,r,c,oc,nc);
        dfs(arr,i,j-1,r,c,oc,nc);
        dfs(arr,i+1,j,r,c,oc,nc);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int nc) {
        int r=image.length;
        int c=image[0].length;
        int oc=image[sr][sc];
        if (oc == nc) return image;
        dfs(image,sr,sc,r,c,oc,nc);
        return image;
    }
}