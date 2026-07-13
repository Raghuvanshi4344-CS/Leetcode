class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;
        List<Integer> ls=new ArrayList<>();
        int top=0,bottom=n-1;
        int left=0,right=matrix[0].length-1;
        while(top<=bottom && left<=right){
            for(int j=left;j<=right;j++){
                ls.add(matrix[top][j]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ls.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    ls.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ls.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ls;
    }
}